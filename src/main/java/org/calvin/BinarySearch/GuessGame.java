package org.calvin.BinarySearch;

class Guess {
    public final int n;
    public Guess(int n) {
        this.n = n;
    }

    public int guess(int mid) {
        return Integer.compare(n, mid);
    }
}
/* The guess API is defined in the parent class Guess.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessGame extends Guess {
    public GuessGame(int n) {
        super(n);
    }

    public int guessNumber(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) return 1;
        int first = 1;
        int last = n;
        int x = 1;
        while (first <= last) {
            int mid = first + ((last - first) / 2);
            x = guess(mid);
            if (x == -1) {
                last = mid - 1;
            } else if (x == 1) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return n; //can't find!
    }
}
