/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.FlyWeight;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GazillionTest {
    private static final int ROWS = 6;
    private static final int COLS = 10;

    Gazillion[][] matrix;

    @BeforeEach
    public void setUp() {
        matrix = new Gazillion[ROWS][COLS];
    }

    @Test
    public void report() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        // Setup using constructor
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLS; j++)
                matrix[i][j] = new Gazillion(COLS);
        // Run
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j].report();
                verify(ps).print(" " + i + j + " size:" + ROWS*COLS);
            }
        }
    }
}
