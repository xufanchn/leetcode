package com.xf;

// 找出最大的可达成数字
public class S2769 {
    public int theMaximumAchievableX(int num, int t) {
        /*
         * 1. 当 x > num 时，最有可能：x - t = num + t，x = num + 2t
         * 2. 当 x < num 时，最有可能：x + t = num - t，x = num - 2t
         * 综上，要求最大，则考虑情况1
         */
        // 优化：num + (t << 1)
        return num + t * 2;

    }
}
