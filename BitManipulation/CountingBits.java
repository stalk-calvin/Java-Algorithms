public class CountingBits {
    public int[] countBits(int num) {
        if (num < 0) {
            return new int[0];
        }
        int[] result = new int[num+1];
        int count = 0;
        while (count <= num) {
            int countBits = 0;
            int tempCount = count;
            while (tempCount != 0) {
                int bit = tempCount & 1;
                if (bit == 1) {
                    countBits++;
                }
                tempCount >>>= 1;
            }
            result[count] = countBits;
            count++;
        }
        return result;
    }
}
