package com.zclvct.leetcode.前缀和数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给你一个整数数组 nums 和一个整数   k ，请你统计并返回 该数组中和为   k   的连续子数组的个数   。
 *
 *    
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：nums = [1,2,3], k = 3
 * 输出：2
 *    
 *
 * 提示：
 *
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 *
 * @date 2022/7/11 20:24
 */
public class Solution {

    public int subarraySum(int[] nums, int k) {
        int[] preSum = new int[nums.length+1];

        for (int i = 0; i < nums.length; i++) {
            preSum[i + 1] =  nums[i] + preSum[i];
        }
        int res = 0;
        // 穷举所有子数组
        for (int i = 1; i <= nums.length; i++)
            for (int j = 0; j < i; j++)
                // 子数组 nums[j..i-1] 的元素和
                if (preSum[i] - preSum[j] == k)
                    res++;

        return res;

    }

    public int subarraySum2(int[] nums, int k) {
        // key：前缀和，value：key 对应的前缀和的个数
        Map<Integer, Integer> preSumFreq = new HashMap<>();
        // 对于下标为 0 的元素，前缀和为 0，个数为 1
        preSumFreq.put(0, 1);

        int preSum = 0;
        int count = 0;
        for (int num : nums) {
            preSum += num;

            // 先获得前缀和为 preSum - k 的个数，加到计数变量里
            if (preSumFreq.containsKey(preSum - k)) {
                count += preSumFreq.get(preSum - k);
            }

            // 然后维护 preSumFreq 的定义
            preSumFreq.put(preSum, preSumFreq.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

}
