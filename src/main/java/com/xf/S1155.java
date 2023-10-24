package com.xf;

/**
 * 该题目一眼动态规划，但属于二阶动态规划；
 * 题目有个误区，每个骰子只能投掷 1 次，即总次数等于骰子数量。
 *
 * @author xf
 * @date 2023/10/24
 */
public class S1155 {
    private static final int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        // 当总数大于所有骰子最大面之和时无解，当总数小于骰子最小面之和时无解
        if (target < n || target > n * k) {
            return 0;
        }

        /*
         * 投 i 个骰子，点数和为 j，最后一个骰子点数为 k，方法数量为 n
         * n = dp(i,j) + dp(i-1,j-k) + ... + dp(0,0)
         * 边界条件：dp[0][0] = 1
         */
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int x = 1; x <= k; x++) {
                    if (j - x >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - x]) % MOD;
                    }
                }
            }
        }

        return dp[n][target];
    }

}
