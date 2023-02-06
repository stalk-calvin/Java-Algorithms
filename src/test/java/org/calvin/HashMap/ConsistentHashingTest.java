package org.calvin.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsistentHashingTest {

    private ConsistentHashing fixture;

    @BeforeEach
    void setUp() {
        fixture = new ConsistentHashing(3);
    }

    @Test
    public void shouldAddNodes() {
        ConsistentHashing.Node node1 = new ConsistentHashing.Node("node1");
        ConsistentHashing.Node node2 = new ConsistentHashing.Node("node2");
        ConsistentHashing.Node node3 = new ConsistentHashing.Node("node3");

        fixture.addNode(node1);
        fixture.addNode(node2);
        fixture.addNode(node3);

        assertEquals(3, fixture.getNodes().size());
        assertTrue(fixture.getNodes().contains(node1));
        assertTrue(fixture.getNodes().contains(node2));
        assertTrue(fixture.getNodes().contains(node3));
    }

    @Test
    public void shouldRemoveNodes() {
        ConsistentHashing.Node node1 = new ConsistentHashing.Node("node1");
        ConsistentHashing.Node node2 = new ConsistentHashing.Node("node2");
        ConsistentHashing.Node node3 = new ConsistentHashing.Node("node3");

        fixture.addNode(node1);
        fixture.addNode(node2);
        fixture.addNode(node3);

        fixture.removeNode(node2);

        assertEquals(2, fixture.getNodes().size());
        assertTrue(fixture.getNodes().contains(node1));
        assertFalse(fixture.getNodes().contains(node2));
        assertTrue(fixture.getNodes().contains(node3));
    }

    @Test
    public void shouldGetNodes() {
        ConsistentHashing.Node node1 = new ConsistentHashing.Node("node1");
        ConsistentHashing.Node node2 = new ConsistentHashing.Node("node2");
        ConsistentHashing.Node node3 = new ConsistentHashing.Node("node3");

        fixture.addNode(node1);
        fixture.addNode(node2);
        fixture.addNode(node3);

        String key1 = "key1";
        String key2 = "key2";

        ConsistentHashing.Node foundNode1 = fixture.getNode(key1);
        ConsistentHashing.Node foundNode2 = fixture.getNode(key2);

        assertEquals(3, fixture.getNodes().size());
        assertEquals(node1, foundNode1);
        assertEquals(node3, foundNode2);
    }

    @Test
    public void shouldBehaveConsistent() {
        ConsistentHashing.Node node1 = new ConsistentHashing.Node("node1");
        ConsistentHashing.Node node2 = new ConsistentHashing.Node("node2");
        ConsistentHashing.Node node3 = new ConsistentHashing.Node("node3");

        fixture.addNode(node1);
        fixture.addNode(node2);
        fixture.addNode(node3);

        String key1 = "key1";
        String key2 = "key2";

        ConsistentHashing.Node foundNode1 = fixture.getNode(key1);
        ConsistentHashing.Node foundNode2 = fixture.getNode(key2);

        assertEquals(3, fixture.getNodes().size());
        assertEquals(node1, foundNode1);
        assertEquals(node3, foundNode2);

        fixture.removeNode(node1);

        ConsistentHashing.Node node1AfterRemoval = fixture.getNode(key1);
        ConsistentHashing.Node node2AfterRemoval = fixture.getNode(key2);

        assertEquals(node3, node1AfterRemoval);
        assertSame(node3, node1AfterRemoval);
        assertSame(node3, node2AfterRemoval);
    }
}