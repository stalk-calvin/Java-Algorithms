public class IntStringConversions {

    public int strToInt(String str) {
        int res = 0;
        boolean flag = false;
        int len = str.length();
        int i = 0;
        int ch;

        if (str.charAt(i) == '-') {
            flag = true;
            i++;
        }

        while (i < len) {
            ch = str.charAt(i) - '0';
            res = res * 10 + ch;
            i++;
        }

        if (flag) res = -res;
        return res;
    }

    public String intToStr(int num) {
        int k = num < 0 ? 1 : 0; // if num < 0, need extra space to save '-'
        int len = k + 1; // length start from 1.
        int tmp = num;
        while ((tmp = tmp/10) != 0) {
            len++;
        }
        char[] res = new char[len];
        if (num < 0) {
            res[0] = '-';
            tmp = -num;
        } else {
            tmp = num;
        }
        int i = len -1;
        int ch;
        while (i >= k) {
            ch = tmp % 10; 
            res[i] = (char)(ch + '0');
            tmp = (tmp-ch) / 10;
            i--;
        }

        return new String(res);
    }

    public static void main(String[] args) {
        IntStringConversions sol = new IntStringConversions();

        String[] strs = {
            "0", "1", "-1",
            "10", "101", "-111"
        };

        int[] nums = {
            0, 1, -1,
            10, 101, -111
        };

        int count = nums.length;
        int failed = 0;
        for (int i = 0; i < count; i++) {
            int result = sol.strToInt(strs[i]);
            if (result != nums[i]) {
                failed++;
                System.out.println("Test: " + strs[i] + ", expect: " + nums[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases, " + (count-failed) + " success, " + failed + " failed.");

        failed = 0;
        for (int i = 0; i < count; i++) {
            String result = sol.intToStr(nums[i]);
            if (!result.equals(strs[i])) {
                failed++;
                System.out.println("Test: " + nums[i] + ", expect: " + strs[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases, " + (count-failed) + " success, " + failed + " failed.");
    }
}
