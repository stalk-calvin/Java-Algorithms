package org.calvin.DesignPatterns.Structural.Adapter.comparison.before;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterDemoTest {
    private Object[] shapes;
    private static int x1 = 10, y1 = 20;
    private static int x2 = 30, y2 = 60;
    private static int width = 40, height = 40;

    @BeforeEach
    public void setUp() throws Exception {
        shapes = new Object[]{new Line(), new Rectangle()};
    }

    @Test
    public void testAdaptershouldBefore() throws Exception {
        for (Object shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Line")) {
                ((Line) shape).draw(x1, y1, x2, y2);
            } else if (shape.getClass().getSimpleName().equals("Rectangle")) {
                ((Rectangle) shape).draw(x2, y2, width, height);
            }
        }
    }

}