package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNumbers {
    public List<Integer> sumEvenAfterQueries(int[] input, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        if (input == null || queries == null) {
            return result;
        }
        int sum = 0;
        for (int value : input) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        for (int[] query : queries) {
            int val = query[0];
            int idx = query[1];
            int num = input[idx];
            if (num % 2 == 0) {
                sum -= num;
            }
            int x = val + num;
            input[idx] = x;
            if (x % 2 == 0) {
                sum += x;
            }
            result.add(sum);
        }
        return result;
    }
}
