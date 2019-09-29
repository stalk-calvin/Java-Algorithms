package org.calvin.StackQueue;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] showHigherTemperature(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> s = new Stack<>();
        for (int i=0; i<temperatures.length; i++) {
            int temp = temperatures[i];
            while (!s.isEmpty() && temp > s.peek()[0]) {
                int[] tmp = s.pop();
                result[tmp[1]] = i - tmp[1];
            }
            s.push(new int[]{temp, i});
        }
        return result;
    }

}
