#!/usr/bin/perl
# Generates README.md with # of Java projects

use strict;
use warnings;

use Getopt::Long;
use FindBin qw($Bin);

$| = 1;

my %stats;

GetOptions('readme=s'    => \my $read_me_file_location,
		   'source=s'	 => \my $destination
		   );

if (!$read_me_file_location || !$destination) {
	print "ERROR\n";
	exit;
}

my %exclude = ();
if (-e $Bin.'/'.'exclude') {
	open(my $efh, $Bin.'/'.'exclude') || die "Could not open file to read: exclude";
	while(my $line = <$efh>) {
		$exclude{trim($line)} = 1;
	}
}

# Parse source
print "Parse: $destination\n";
my @java_files = get_javas($destination); 
my $javas;
my $algorithm_count = 0;
foreach my $java_file (@java_files) {
    my $copy_file = $java_file;
    $java_file =~ s/.*calvin\/(.*)/$1/;
    next if (exists $exclude{$java_file});
    $javas .= $java_file."\n";
	if ($copy_file !~ /test.java/i) {
		open(my $fh, $copy_file) || die "Could not open file to read: $java_file";
		while(my $line = <$fh>) {
			$line = trim($line);
			next if ($line =~ /^(return|private)/);
			if ($line =~ /(public|protected|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(\{?|[^;])/) {
				$algorithm_count++;
			}
		}
	}
}
write_file($Bin.'/'.'list_of_src_files', $javas);
print "Saved: list_of_src_files\n";

print "README.md: $read_me_file_location\n";
open(my $fh, $read_me_file_location) || die "Could not open file to read: $read_me_file_location";
my $data = "";
while(my $line = <$fh>) {
	if ($line =~ "^{% number_of_algorithms %}") {
		$data .= "There are roughly ". scalar @java_files . " java algorithms exists.\nSee [algorithm list](scripts/algorithm) for details.";
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
