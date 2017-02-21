/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class FizzBuzz {
    public void fizzBuzz() {
        int counter = 1;
        while (counter <= 100) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(counter));
            }
            counter++;
        }
    }
}
