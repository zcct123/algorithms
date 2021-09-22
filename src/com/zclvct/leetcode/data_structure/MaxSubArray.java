package com.zclvct.leetcode.data_structure;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 *
 *  给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * https://leetcode-cn.com/problems/maximum-subarray/
 * @date 2021/9/18 13:11
 */
public class MaxSubArray {
        
    
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int count = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = count + nums[i];
            count = temp > 0 && temp > nums[i] ? temp : nums[i];
            max = max > count ? max : count;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
