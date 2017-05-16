package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CircularPrime {
    private static void getRotations(int input, List<Integer> r) {
        //key to be used for parsing each digits
        int startingTwoDigit = 10;

        if (input >= startingTwoDigit) {
            List<Integer> rotated = new ArrayList<>();
            while (input > 0) {
                // will give us digits in an arraylist
                rotated.add(input % startingTwoDigit);
                input /= startingTwoDigit;
            }

            for (int i = 1; i < rotated.size(); ++i) {
                int multiplier = 1;
                int numGenerated = 0;

                for (int j = i; j < i + rotated.size(); ++j) {
                    numGenerated += rotated.get(j % rotated.size()) * multiplier;
                    multiplier *= startingTwoDigit;
                }

                r.add(numGenerated);
            }
        }
    }

    private static boolean isPrime(int p) {
        boolean prime = true;
        if (p < 2) {
            prime = false;
        }
        if (p % 2 == 0 && p != 2) {
            prime = false;
        }
        else if (p > 2) {
            for (int i = 3; i <= Math.sqrt(p); i += 2) {
                if (p % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static int getNumberOfCircular(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n > 2) {
            primes.add(2);
        }

        for (int pc = 3; pc <= n; pc += 2) {
            List<Integer> r = new ArrayList<>();
            if (isPrime(pc) && isCircularPrime(pc)) {
                primes.add(pc);
            }
        }

        return primes.size();
    }

    public static boolean isCircularPrime(int val) {
        List<Integer> r = new ArrayList<>();
        getRotations(val, r);
        boolean cp = true;
        for (int c: r) {
            if (!isPrime(c)) {
                cp = false;
                break;
            }
        }
        return cp;
    }
}
