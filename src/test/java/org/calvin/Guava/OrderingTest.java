/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@Slf4j
public class OrderingTest {
    @Test
    public void shouldOrderbeReversed() {
        List<String> actual = Lists.newArrayList("a", null, "b", "c");
        Collections.sort(actual,
                Ordering.natural().nullsFirst().reverse());

        List<String> expected = Lists.newArrayList("c", "b", "a", null);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMin() {
        List<String> input = Lists.newArrayList("a", "b", "c");
        String actual = Ordering.natural().min(input);
        assertEquals("a", actual);
    }

    @Test
    public void shouldGetMax() {
        List<String> input = Lists.newArrayList("a", "b", "c");
        String actual = Ordering.natural().max(input);
        assertEquals("c", actual);
    }

    @Test
    public void shouldOrderLeastToGreatest() {
        List<Integer> startingLineUp = Lists.newArrayList(
                73, 58, 66, 57, 32, 88, 90, 12, 15, 99, 11
        );

        List<Integer> startingLineUpInOrder = Ordering
                .natural()
                .leastOf(startingLineUp, startingLineUp.size());

        log.info(startingLineUpInOrder.toString());

        assertEquals(new Integer(11), startingLineUpInOrder.get(0));
        assertEquals(new Integer(99), startingLineUpInOrder.get(startingLineUp.size() - 1));
    }

    @Test
    public void shouldOrderGreatestToLeast() {
        List<Integer> startingLineUp = Lists.newArrayList(
                73, 58, 66, 57, 32, 88, 90, 12, 15, 99, 11
        );

        List<Integer> startingLineUpGreatestToLeast = Ordering
                .natural()
                .greatestOf(startingLineUp, startingLineUp.size());

        log.info(startingLineUpGreatestToLeast.toString());

        assertEquals(new Integer(99), startingLineUpGreatestToLeast.get(0));
        assertEquals(new Integer(11), startingLineUpGreatestToLeast.get(startingLineUp.size() - 1));
    }

    @Test
    public void shouldOrderNatural() {
        List<Integer> uwConferenceTitles = Lists.newArrayList(
                1896, 1897, 1901, 1906, 1912,
                1952, 1959, 1962, 1993, 1998,
                1999, 2010, 2011, 2012);

        assertTrue(Ordering.natural().isOrdered(uwConferenceTitles));
    }

    @Test
    public void shouldOrderCaseInsensitive() {
        List<String> secConferenceEast = Lists.newArrayList(
                "alabama",
                "Alabama",
                "ALABAMA");

        assertTrue(Ordering.natural().from(String.CASE_INSENSITIVE_ORDER).isOrdered(secConferenceEast));
    }

    @Test
    public void shouldOrderByProductName() {
        List<Product> beerGlasses = Lists.newArrayList(
                new Product("Flute Glass", "Enhances and showcases..."),
                new Product("Pilsner Glass (or Pokal)", "showcases color, ..."),
                new Product("Pint Glass", "cheap to make..."),
                new Product("Goblet (or Chalice)", "Eye candy..."),
                new Product("Mug (or Seidel, Stein)", "Easy to drink..."),
                new Product(null, null)
        );

        Ordering<Product> byProductName = Ordering.natural().nullsFirst()
                .onResultOf((Product p) -> (p.getName()));

        Product firstBeerGlass = byProductName.min(beerGlasses);
        assertNull(firstBeerGlass.getName());

        Product lastBeerGlass = byProductName.max(beerGlasses);
        assertEquals("Pint Glass", lastBeerGlass.getName());
    }
}
