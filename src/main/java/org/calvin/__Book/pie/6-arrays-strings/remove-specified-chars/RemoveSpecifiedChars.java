public class RemoveSpecifiedChars {

    public String removeChars(String str, String remove) {
        char[] s = str.toCharArray();
        char[] r = remove.toCharArray();
        int count = 0;
        
        // flags automaticlly initialized to false, size of 128 assumes ASCII
        boolean[] flags = new boolean[128];

        // set flags for characters to be removed
        for (int i = 0; i < r.length; i++) {
            flags[r[i]] = true;
        }

        // loop through all the characters, copying only if they aren't flagged
        for (int i = 0; i < s.length; i++) {
            if (!flags[s[i]]) {
                s[count++] = s[i];
            }
        }

        return new String(s, 0, count);
    }

    public static void main(String[] args) {
        RemoveSpecifiedChars sol = new RemoveSpecifiedChars();

        String[] strs = {
            "Battle of the Vowels: Hawaii vs. Grozny", "aeiou"
        };
        String[] results = {
            "Bttl f th Vwls: Hw vs. Grzny"
        };
        String result;

        int count = results.length;
        int failed = 0;
        for (int i = 0; i < count; i++) {
            result = sol.removeChars(strs[2*i], strs[2*i+1]);
            if (!result.equals(results[i])) {
                failed++;
                System.out.println("Test: " + strs[2*i] + ", expected: " + results[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases, " + (count - failed) + " success, " + failed + " failed.");
    }
}
