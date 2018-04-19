public class PermutationOfString {
    public void permutation(String str) {
        doPermutation("", str);
    }
    private void doPermutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                doPermutation(prefix+str.charAt(i), 
                        str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }
    public static void main(String[] args) {
        PermutationOfString sol = new PermutationOfString();
        String[] strs = {
            "",
            "a",
            "abc",
            "aac",
        };
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            System.out.println("==== permutation of " + strs[i] + " ====");
            sol.permutation(strs[i]);
        }
    }
}
