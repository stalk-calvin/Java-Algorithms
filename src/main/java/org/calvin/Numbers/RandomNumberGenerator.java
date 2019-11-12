package org.calvin.Numbers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

public class RandomNumberGenerator {
    public static void main(String[] args) throws NoSuchProviderException, NoSuchAlgorithmException, IOException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
        int capacity = (int) 1e6; // million
        String unsortedFile = "unsorted.txt";
        String sortedFile = "sorted.txt";
        Stream<Integer> randomGenerator = Stream.generate(secureRandom::nextInt);

        // 1. Using Java 8, generate a million random numbers and output those numbers to a file (unsortedFile)
        Files.write(Paths.get(unsortedFile), (Iterable<String>) randomGenerator.limit(capacity).map(String::valueOf)::iterator);

        // For debug: print first 100 unsorted numbers from "unsortedFile"
        // try (Stream<String> words = Files.lines(Paths.get(unsortedFile))) {
        //    words.limit(100).forEach(num -m> System.out.println("Unsorted: " + num));
        // }

        // 2. Create a program which sorts the output of your random number generator
        List<String> sorted;
        try (Stream<String> words = Files.lines(Paths.get(unsortedFile))) {
            sorted = words.sorted(comparingInt(Integer::parseInt)).collect(toList());
        }

        // Sends the results to another file (sortedFile)
        Files.write(Paths.get(sortedFile), sorted);

        // For debug: print first 100 sorted numbers from "sortedFile"
        // try (Stream<String> words = Files.lines(Paths.get(sortedFile))) {
        //    words.limit(100).forEach(num -> System.out.println("Sorted: " + num));
        // }
    }
}
