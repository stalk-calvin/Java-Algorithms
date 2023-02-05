package org.calvin.DesignPatterns.Structural.Adapter.comparison.after;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterDemoTest {
    private Shape[] shapes;
    private static int x1 = 10, y1 = 20;
    private static int x2 = 30, y2 = 60;

    @BeforeEach
    public void setUp() throws Exception {
        shapes = new Shape[]{ new LineAdapter(new Line()), new RectangleAdapter(new Rectangle())};
    }

    @Test
    public void testAdaptershouldBefore() throws Exception {
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}