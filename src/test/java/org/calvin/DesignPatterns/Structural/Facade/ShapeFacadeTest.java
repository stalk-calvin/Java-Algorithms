/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Facade;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ShapeFacadeTest {
    ShapeFacade fixture;

    @Before
    public void setUp() {
        fixture = new ShapeFacade();
    }

    @Test
    public void shouldDrawCircle() {
        String expected = "circle";
        String actual = fixture.drawCircle();
        assertTrue(actual.toLowerCase().startsWith(expected));
    }

    @Test
    public void shouldDrawRectangle() {
        String expected = "rectangle";
        String actual = fixture.drawRectangle();
        assertTrue(actual.toLowerCase().startsWith(expected));
    }

    @Test
    public void shouldDrawSquare() {
        String expected = "square";
        String actual = fixture.drawSquare();
        assertTrue(actual.toLowerCase().startsWith(expected));
    }

}
