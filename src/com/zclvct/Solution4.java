package com.zclvct;

import java.util.Arrays;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 *
 * 返回这三个数的和。
 *
 * 假定每组输入只存在恰好一个解。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * 示例 2：
 *
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 */
public class Solution4 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int r = i + 1;
            int l = nums.length - 1;

            while (r < l) {
                int num = nums[i] + nums[r] + nums[l];
                if(Math.abs(num - target)  < y) {
                    y = Math.abs(num - target);
                    res = num;
                }
                if( num > target ) {
                    l --;
                } else if (num < target) {
                    r ++;
                }else {
                    return  target;
                }

            }

        }
        return res;
    }

    public static void main(String[] args) {
        threeSumClosest(new int[]{-1, 2, 1, -4},1);
    }
}
