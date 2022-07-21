package com.zclvct.leetcode.二分查找;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 875. 爱吃香蕉的珂珂
 * @date 2022/7/17 16:23
 */
public class Solution7 {

    public int minEatingSpeed(int[] piles, int h) {
        int left = Integer.MAX_VALUE;
        int right = 0;
        for (int i = 0; i < piles.length; i++) {
            left = left > piles[i] ? piles[i] : left;
            right = right < piles[i] ? piles[i] : right;
        }

        while (left < right) {
            int mid = left + (right - left)/2;
            int hour = getHour(piles, mid);

            if(hour > h) {
                left = mid + 1;
            } else if (hour <= h) {
                right = mid;
            }
        }
        return left;
    }

    int getHour(int[] piles, int count) {
        int hour = 0;
        for (int i = 0; i < piles.length; i++) {
            hour += piles[i] % count == 0? piles[i] / count : piles[i] / count + 1;
        }
        return hour;
    }
}
