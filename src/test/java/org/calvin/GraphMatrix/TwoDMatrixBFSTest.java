package org.calvin.GraphMatrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoDMatrixBFSTest {
    private TwoDMatrixBFS fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new TwoDMatrixBFS();
    }

    @Test
    public void shouldFindASimpleDistance() throws Exception {
        char[][] matrix = {
                {'s', '_', '_', '_'},
                {'X', 'X', '_', '_'},
                {'_', '_', 'e', '_'}
        };
        assertEquals(4, fixture.minDistance(matrix));
    }

    @Test
    public void shouldFindFromBottom() throws Exception {
        char[][] matrix = {
                {'e', '_', '_', '_'},
                {'X', 'X', '_', '_'},
                {'_', '_', '_', 's'}
        };
        assertEquals(5, fixture.minDistance(matrix));
    }

    @Test
    public void shouldFindALongDistance() throws Exception {
        char[][] matrix = {
                {'s', '_', '_', '_'},
                {'X', 'X', 'X', '_'},
                {'_', '_', '_', '_'},
                {'_', 'X', 'X', 'X'},
                {'_', '_', '_', 'e'}
        };
        assertEquals(13, fixture.minDistance(matrix));
    }

    @Test
    public void shouldNotFindAny() throws Exception {
        char[][] matrix = {
                {'s', 'X', '_'},
                {'_', 'X', '_'},
                {'_', 'X', '_'},
                {'_', 'X', 'X'},
                {'_', 'X', 'e'}
        };
        assertEquals(-1, fixture.minDistance(matrix));
    }

    @Test
    public void shouldNotFindOnNull() throws Exception {
        assertEquals(-1, fixture.minDistance(null));
    }
}