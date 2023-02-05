/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ShapeFactoryTest {
    ShapeFactory fixture;

    @Mock
    PrintStream ps;

    @BeforeEach
    public void setUp() {
        fixture = new ShapeFactory();
        System.setOut(ps);
    }

    @Test
    public void shouldBeNullWhenNullShape() {
        Shape shape = fixture.getShape(null);
        assertEquals(null, shape);
    }

    @Test
    public void shouldCreateCircleShapeAndDraw() {
        Shape circleShape = new Circle();
        Shape shape = fixture.getShape("circle");
        assertEquals(circleShape.toString().trim(), shape.toString().trim());
        shape.draw();
        verify(ps).println("Inside Circle::draw() method.");
    }

    @Test
    public void shouldCreateRectangleShapeAndDraw() {
        Shape rectangleShape = new Rectangle();
        Shape shape = fixture.getShape("rectangle");
        assertEquals(rectangleShape.toString().trim(), shape.toString().trim());
        shape.draw();
        verify(ps).println("Inside Rectangle::draw() method.");
    }

    @Test
    public void shouldCreateSquareShapeAndDraw() {
        Shape squareShape = new Square();
        Shape shape = fixture.getShape("square");
        assertEquals(squareShape.toString().trim(), shape.toString().trim());
        shape.draw();
        verify(ps).println("Inside Square::draw() method.");
    }

    @Test
    public void shouldReturnNullOnUnknown() {
        Shape shape = fixture.getShape("unknown");
        assertEquals(null, shape);
    }
}
