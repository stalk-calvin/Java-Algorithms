/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class MultiplicationWithoutMultiply {
    /**
     * O(N) where N is # of num1
     **/
    public int multiply(int num1, int num2) {
        int result = 0;
        boolean atLeastOneNegative = (num1 < 0 && num2 >= 0) || (num2 < 0 && num1 >= 0);
        boolean bothNegativeOrPositive = !atLeastOneNegative;
        num1 = Math.abs(num1);
        for (int i = 0; i < num1; i++) {
            if (atLeastOneNegative && num2 > 0 || bothNegativeOrPositive && num2 < 0)
                result -= num2;
            else
                result += num2;
        }

        return result;
    }
}
