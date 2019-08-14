package org.calvin.StackQueue;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class SetOfStacksTest {
    private SetOfStacks fixture;
    private static final int capacity = 3;

    @Before
    public void setUp() throws Exception {
        fixture = new SetOfStacks(capacity);
    }

    @Test
    public void shouldBeAbleToPushPopMultiple() throws Exception {
        fixture.push(5);
        fixture.push(4);
        fixture.push(3);
        fixture.push(2);
        fixture.push(1);

        List<Integer> expected = Lists.newArrayList(1,2,3,4,5);

        for (int element : expected) {
            assertEquals(element, fixture.pop());
        }
    }

    @Test
    public void isEmpty() {
        assertTrue(fixture.isEmpty());
    }

    @Test
    public void isFull() {
        fixture.push(3);
        fixture.push(2);
        fixture.push(1);
        assertTrue(fixture.isFull());
    }
}