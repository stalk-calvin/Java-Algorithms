package org.calvin.Arrays;

public class GetLastNLog {
    private int maxSize;
    private int[] circularBuffer;
    private int currIdx;

    public GetLastNLog(int n) {
        this.maxSize = n;
        this.circularBuffer = new int[n];
        this.currIdx = 0;
    }

    public void record(int orderId) {
        circularBuffer[currIdx] = orderId;
        currIdx = (currIdx + 1) % maxSize;
    }

    public int getLast(int i) {
        return circularBuffer[(currIdx - i + maxSize) % maxSize];
    }
}
