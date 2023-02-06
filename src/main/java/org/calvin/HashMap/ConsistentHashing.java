package org.calvin.HashMap;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHashing {
    private final SortedMap<Long, Node> hashRing = new TreeMap<>();
    private final List<Node> nodes = new ArrayList<>();
    private final int numberOfReplicas;
    private final MessageDigest digest;

    public ConsistentHashing(int numberOfReplicas) {
        this.numberOfReplicas = numberOfReplicas;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void addNode(Node node) {
        nodes.add(node);
        for (int i = 0; i < numberOfReplicas; i++) {
            byte[] hash = digest.digest((node.toString() + i).getBytes());
            long value = 0;
            for (int j = 0; j < 8; j++) {
                int lowerEightBits = hash[j] % 256;
                value = (value * 256) + lowerEightBits;
            }
            hashRing.put(value, node);
        }
    }

    public void removeNode(Node node) {
        nodes.remove(node);
        for (int i = 0; i < numberOfReplicas; i++) {
            byte[] hash = digest.digest((node.toString() + i).getBytes());
            long value = 0;
            for (int j = 0; j < 8; j++) {
                int lowerEightBits = hash[j] % 256;
                value = (value * 256) + lowerEightBits;
            }
            hashRing.remove(value);
        }
    }

    public Node getNode(Object key) {
        if (hashRing.isEmpty()) {
            return null;
        }
        byte[] hash = digest.digest(key.toString().getBytes());
        long value = 0;
        for (int j = 0; j < 8; j++) {
            int lowerEightBits = hash[j] % 256;
            value = (value * 256) + lowerEightBits;
        }
        if (!hashRing.containsKey(value)) {
            SortedMap<Long, Node> tailMap = hashRing.tailMap(value);
            value = tailMap.isEmpty() ? hashRing.firstKey() : tailMap.firstKey();
        }
        return hashRing.get(value);
    }

    public List<Node> getNodes() {
        return Collections.unmodifiableList(nodes);
    }

    public static class Node {
        private final String name;

        public Node(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
