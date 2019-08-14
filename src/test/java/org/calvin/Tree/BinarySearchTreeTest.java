package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {
    private BinarySearchTree fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new BinarySearchTree();
    }

    @Test
    public void insertIterative() {
        fixture.insertIterative(10);
        fixture.insertIterative(6);
        fixture.insertIterative(18);
        fixture.insertIterative(4);
        fixture.insertIterative(7);
        fixture.insertIterative(15);
        fixture.insertIterative(21);

        List<Integer> actual = fixture.inorder();
        List<Integer> expected = Lists.newArrayList(4,6,7,10,15,18,21);
        assertEquals(expected, actual);
    }

    @Test
    public void insert() {
        fixture.insert(10);
        fixture.insert(6);
        fixture.insert(18);
        fixture.insert(4);
        fixture.insert(7);
        fixture.insert(15);
        fixture.insert(21);

        List<Integer> actual = fixture.inorder();
        List<Integer> expected = Lists.newArrayList(4,6,7,10,15,18,21);
        assertEquals(expected, actual);
    }

    @Test
    public void delete() {
        fixture.insert(10);
        fixture.insert(6);
        fixture.insert(18);
        fixture.insert(4);
        fixture.insert(7);
        fixture.insert(15);
        fixture.insert(21);

        fixture.delete(21);
        fixture.delete(10);

        List<Integer> actual = fixture.inorder();
        List<Integer> expected = Lists.newArrayList(4,6,7,15,18);
        assertEquals(expected, actual);
    }
}