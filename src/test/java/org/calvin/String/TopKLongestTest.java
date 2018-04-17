package org.calvin.String;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopKLongestTest {
    private TopKLongest fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new TopKLongest();
    }

    @Test
    public void shouldFindTopKLongest() throws Exception {
        List<String> expected = Lists.newArrayList("aaaa","aaaaa");
        List<String> actual = fixture.topK(2, Lists.newArrayList("a","aa","aaa","aaaa","aaaaa").iterator());

        assertEquals(expected, actual);
    }

}