package org.calvin.String;

public class LongestPalindromicSubsequence {
    static int longestPalindromeSubseq(String s) {
        int l = s.length();
        int[][] dp = new int[l][l];
        if(l == 1)
            return 1;
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            dp[i][i] = 1;
            for(int j=i+1;j<l;j++){
                if(s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);

                }
            }
        }
        return dp[0][s.length()-1];
    }
}
