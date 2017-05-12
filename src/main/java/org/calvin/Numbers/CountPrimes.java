/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public List<Integer> countPrimes(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] m = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            if (m[i])
                continue;

            result.add(i);
            for (int j = i; j <= n; j = j + i)
                m[j] = true;
        }

        return result;
    }

    public int getNumberOfPrime(int n) {
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes++;
        }

        return primes;
    }
}
