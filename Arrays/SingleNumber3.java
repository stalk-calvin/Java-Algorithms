public class SingleNumber3 {
    public int[] singleNumber(int[] n) {
        if (n == null) return n;
        if (n.length == 1) return new int[0];
        Arrays.sort(n);
        List<Integer> r = new ArrayList<>();
        int prev = n[0];
        boolean dupe = false;
        for (int i = 1; i < n.length; i++) {
            if (prev == n[i]) {
                dupe = true;
                continue;
            } else if (!dupe) {
                r.add(prev);
            }
            prev = n[i];
            dupe = false;
        }
        if (!dupe) {
            r.add(prev);
        }
        int[] result = new int[r.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = r.get(i);
        }
        return result;
    }
}
