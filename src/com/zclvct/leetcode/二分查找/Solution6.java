package com.zclvct.leetcode.二分查找;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 1011. 在 D 天内送达包裹的能力
 * @date 2022/7/17 16:02
 */
public class Solution6 {

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < weights.length; i++) {
            right += weights[i];
            left = left < weights[i]? weights[i] : left;
        }

        while (left < right) {
            int mid = left + (right - left)/2;
            if(getDays(weights,mid) < days) {
                right = mid ;
            }else if(getDays(weights,mid) > days) {
                left = mid + 1;
            }else {
                // 求最小左边界  右指针左移
                right = mid;
            }
        }
        return left ;
    }

    static int getDays(int[] weights, int sum) {

        int days = 1;
        int count = 0;

        for (int i = 0; i < weights.length; i++) {
            count += weights[i];
            if(count > sum) {
                days++;
                count = weights[i];
            }
        }
        return days;
    }

    public static void main(String[] args) {
        shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5);
    }
}
