package org.calvin.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class KnapSack01 {
    public static class Item {
        private String label;
        private int value;
        private int weight;
        public Item(String label, int weight, int value) {
            this.label = label;
            this.value = value;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return label + " v:" + value + " w:" + weight;
        }
    }

    public List<Item> fillKnapSack(Item[] input, int knapsackWeight) {
        List<Item> results = new ArrayList<>();
        if (input == null || knapsackWeight == 0) {
            return results;
        }

        Item[] items = new Item[input.length + 1];
        items[0] = new Item("", 0, 0);
        System.arraycopy(input, 0, items, 1, input.length);

        int numRows = items.length;
        int numCols = knapsackWeight + 1;
        int[][] mat = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i==0 || j ==0 ) {
                    mat[i][j] = 0;
                } else if (j >= items[i].weight) {
                    mat[i][j] = Math.max(items[i].value + mat[i - 1][j - items[i].weight], mat[i - 1][j]);
                } else {
                    mat[i][j] = mat[i - 1][j];
                }
            }
        }
        int i = numRows - 1;
        int j = numCols - 1;
        while (mat[i][j] != 0) {
            if (mat[i - 1][j] == mat[i][j]) {
                i--;
            } else {
                results.add(items[i]);
                j -= items[i].weight;
                i--;
            }
        }
        return results;
    }
}
