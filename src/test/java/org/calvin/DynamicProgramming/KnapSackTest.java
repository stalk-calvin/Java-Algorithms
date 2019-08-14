package org.calvin.DynamicProgramming;

import com.google.common.collect.Lists;
import org.calvin.DynamicProgramming.KnapSack.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class KnapSackTest {

    private KnapSack fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new KnapSack();
    }

    @Test
    public void shouldFillKnapSack() {
        Item[] input = new Item[4];
        input[0] = new Item("A", 1,1);
        input[1] = new Item("B", 3,4);
        input[2] = new Item("C", 4,5);
        input[3] = new Item("D", 5,7);

        List<Item> actual = fixture.fillKnapSack(input, 7);
        List<Item> expected = Lists.newArrayList(input[2], input[1]);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFillKnapSackAnother() {
        Item[] input = new Item[4];
        input[0] = new Item("A", 2,2);
        input[1] = new Item("B", 2,4);
        input[2] = new Item("C", 4,6);
        input[3] = new Item("D", 5,9);

        List<Item> actual = fixture.fillKnapSack(input, 8);
        List<Item> expected = Lists.newArrayList(input[3], input[1]);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFillKnapsackZeroWeight() {
        assertTrue(fixture.fillKnapSack(new Item[]{}, 0).isEmpty());
    }
}