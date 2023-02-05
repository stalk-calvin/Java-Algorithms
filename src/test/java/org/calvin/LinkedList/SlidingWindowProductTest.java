package org.calvin.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SlidingWindowProductTest {
    private SlidingWindowProduct fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new SlidingWindowProduct(3);
    }

    @Test
    public void shouldGetProduct() {
        fixture.add(4); // 4 = 4
        assertEquals(4, fixture.getProduct());
        fixture.add(2); // 4*2 = 8
        assertEquals(8, fixture.getProduct());
        fixture.add(3); // 4*2*3 = 24
        assertEquals(24, fixture.getProduct());
        fixture.add(8); // 2*3*8 = 48
        assertEquals(48, fixture.getProduct());
        fixture.add(9); // 3*8*9 = 216
        assertEquals(216, fixture.getProduct());
        fixture.add(0); // 3*8*0 = 0
        assertEquals(0, fixture.getProduct());
    }
}