public class CombinationsOfString {
    private String str;
    public void combine(String str) {
        this.str = str; // used to check if alreay combine
        doCombine("", str);
    }

    private void doCombine(String first, String second) {
        System.out.println(first);
        int n = second.length();
        for (int i = 0; i < n; i++) {
            if (str.substring(0, i).indexOf(second.charAt(i)) < 0) {
                doCombine(first+second.charAt(i), second.substring(i+1, n));
            } else { // already combine, continue next
                first = first + second.charAt(i);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        CombinationsOfString sol = new CombinationsOfString();
        String[] strs = {
            "a",
            "aa",
            "abc",
            "aaa",
            "aaaa",
            "aba",
            "abab",
        };
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            System.out.println("==== Combination of " + strs[i] + " ====");
            sol.combine(strs[i]);
        }
    }
}
