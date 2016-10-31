package org.calvin.Numbers;

public class SellStock {
    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        if (prices.length == 0) return 0;
        if (prices.length == 1) return 0;
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
