#!/usr/bin/perl
# Generates README.md with # of Java projects

use strict;
use warnings;

use Getopt::Long;
use FindBin qw($Bin);

$| = 1;

GetOptions('readme=s'    => \my $read_me_file_location,
		   'source=s'	 => \my $destination
		   );

if (!$read_me_file_location || !$destination) {
	print "ERROR\n";
	exit;
}

my %exclude_files = ();
my %exclude_code = ();
my $isFile = 0;
if (-e $Bin.'/'.'exclude') {
	open(my $efh, $Bin.'/'.'exclude') || die "Could not open file to read: exclude";
	while(my $line = <$efh>) {
		$line = trim($line);
		if ($line =~ /### FILES/) {
			$isFile = 1;
			next;
		}
		if ($isFile && $line =~ /### END/) {
			$isFile = 0;
			next;
		}
		if ($isFile) {
			$exclude_files{$line} = 1;
		} else {
			$exclude_code{$line} = 1;
		}
	}
}
# Parse source
print "Parse: $destination\n";
my @java_files = get_javas($destination); 
my $javas;
my $algorithm_count = 0;
my $algorithm_test_count = 0;
foreach my $java_file (@java_files) {
	$java_file = trim($java_file);
	next if ($java_file =~ /abstract/i);
    my $copy_file = $java_file;
    $java_file =~ s/.*calvin\/(.*)/$1/;
    next if (exists $exclude_files{$java_file});
    
	open(my $fh, $copy_file) || die "Could not open file to read: $java_file";
	my $skip_counter = 0;
	while(my $line = <$fh>) {
		next if ($java_file =~ /public interface/);
		if ($skip_counter > 0) {
			$skip_counter--;
			next;
		}
		$line = trim($line);
		next if ($line =~ /^(return|private)/);
		next if (exists $exclude_code{$line});
		if ($line =~ /\@before/i) {
			$skip_counter++;
			next;
		}
		if ($line =~ /\@test/i) {
			$algorithm_test_count++;
			next;
		}
		next if ($copy_file =~ /test.java/i);
		if ($line =~ /(?:public|protected|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])/) {
			next if ($line =~ /abstract/);
			next if ($line =~ /tostring()/i);
			next if ($line =~ /get/);
			#print $line."\n";
			$algorithm_count++;
		}
	}
	next if ($java_file =~ m/test.java/i);
	$javas .= $java_file."\n";

}
write_file($Bin.'/'.'list_of_src_files', $javas);
print "Saved: list_of_src_files\n";

print "README.md: $read_me_file_location\n";
open(my $fh, $read_me_file_location) || die "Could not open file to read: $read_me_file_location";
my $data = "";
while(my $line = <$fh>) {
	if ($line =~ "^{% number_of_algorithms %}") {
		$data .= "There are roughly ". $algorithm_count . " java algorithms exists with ".$algorithm_test_count." test cases.  \nSee [list of algorithm source files](script/list_of_src_files) for all the algorithms here.";
	} else {
		$data .= $line;
	}
}
$read_me_file_location =~ s/.template$//;
write_file($read_me_file_location, $data);
print "Saved README.md file\n";

sub get_javas {
    my $path    = shift;

    opendir (DIR, $path)
        or die "Unable to open $path: $!";

    my @files =
        map { $path . '/' . $_ }
        grep { !/^\.{1,2}$/ }
        readdir (DIR);

    # Rather than using a for() loop, we can just
    # return a directly filtered list.
    return
        grep { (/\.java$/) &&
               (! -l $_) }
        map { -d $_ ? get_javas($_) : $_ }
        @files;
}


sub write_file {
    my ($filename, $content) = @_;
 
    open my $out, '>:encoding(UTF-8)', $filename or die "Could not open '$filename' for writing $!";;
    print $out $content;
    close $out;
 
    return;
}

sub  trim { my $s = shift; $s =~ s/^\s+|\s+$//g; return $s };
