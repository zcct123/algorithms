package com.zclvct.leetcode.前缀和数组;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给定一个整数数组 nums      和一个整数 k ，返回其中元素之和可被 k 整除的（连续、非空） 子数组 的数目。
 *
 * 子数组 是数组的 连续 部分。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [4,5,0,-2,-3,1], k = 5
 * 输出：7
 * 解释：
 * 有 7 个子数组满足其元素之和可被 k = 5 整除：
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 * 示例 2:
 *
 * 输入: nums = [5], k = 9
 * 输出: 0
 *  
 *
 * 提示:
 *
 * 1 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * 2 <= k <= 104
 *
 * @date 2022/7/11 21:23
 */
public class Solution3 {

    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            int mod =  (sum%k + k)%k;

            map.put(mod , map.getOrDefault(mod,0)+1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            // 几个数中任意选2个数 就是 2 的阶乘 = x * （x -2） /2
            ans += entry.getValue() * (entry.getValue() - 1) / 2;
        }
        return ans;


    }
}
