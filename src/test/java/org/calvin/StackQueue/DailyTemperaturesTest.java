package org.calvin.StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DailyTemperaturesTest {
    @Test
    public void showHigherTemperature() {
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, DailyTemperatures.showHigherTemperature(temperatures));
        temperatures = new int[]{5,4,3,2,1};
        assertArrayEquals(new int[]{0,0,0,0,0}, DailyTemperatures.showHigherTemperature(temperatures));
    }
}