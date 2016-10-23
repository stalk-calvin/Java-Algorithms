public class NumberOf1Bit {
    // you need to treat n as an unsigned value
    public int hammingWeight(int x) {
        int count = 0;
        while (x != 0) {
            int n = x & 1;
            if (n == 1) count++;
            x >>>= 1;
        }
        return count;
    }
}
