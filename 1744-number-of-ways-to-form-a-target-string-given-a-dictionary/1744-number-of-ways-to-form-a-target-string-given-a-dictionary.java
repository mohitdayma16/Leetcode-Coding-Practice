class Solution {
   static long mod = 1000000007l;

    static public int numWays(String[] words, String target) {
        int n = words[0].length();
        long[][] freq = new long[n][26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                freq[j][words[i].charAt(j) - 97]++;
            }
        }
        long[][] dp = new long[n][target.length()];
        for (long[] ls : dp) {
            Arrays.fill(ls, -1);
        }
        long res = solve(n - 1, target.length() - 1, target.toCharArray(), freq, dp);
        return (int)(res % mod);
    }

    static long solve(int i, int j, char[] target, long[][] freq, long[][] dp) {
        if (j < 0) return 1;
        if (i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        long take = 0, notTake = 0;
        take = (freq[i][target[j] - 97] * solve(i - 1, j - 1, target, freq, dp))  % mod;
        take %= mod;
        notTake = solve(i - 1, j, target, freq, dp) % mod;
        return dp[i][j] =  (take + notTake) % mod;
    }
}