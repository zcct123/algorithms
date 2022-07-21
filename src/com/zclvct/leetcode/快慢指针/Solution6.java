package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 42. 接雨水
 * @date 2022/7/16 22:23
 */
public class Solution6 {

    public static int trap(int[] height) {
        int n = height.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int l_max = 0, r_max = 0;
            // 找右边最高的柱子
            for (int j = i; j < n; j++)
                r_max = Math.max(r_max, height[j]);
            // 找左边最高的柱子
            for (int j = i; j >= 0; j--)
                l_max = Math.max(l_max, height[j]);
            // 如果自己就是最高的话，
            // l_max == r_max == height[i]
            res += Math.min(l_max, r_max) - height[i];
        }
        return res;
    }

    public static void main(String[] args) {
        trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}
