import java.util.Map;
import java.util.HashMap;

public class FindFirstNonrepeated {

    public Character firstNonRepeated(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int n = str.length();
        Character ch;
        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int j = 0; j < n; j++) {
            ch = str.charAt(j);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FindFirstNonrepeated sol = new FindFirstNonrepeated();

        String[] strs = {
            "total",
            "teeter"
        };
        char[] results = {
            'o',
            'r'
        };
        int count = results.length;
        int failed = 0;
        char result;
        for (int i = 0; i < count; i++) {
            result = sol.firstNonRepeated(strs[i]);
            if (result != results[i]) {
                failed++;
                System.out.println("Test: " + strs[i] + ", expected: " + results[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases, " + (count - failed) + " success, " + failed + " failed.");
    }
}

