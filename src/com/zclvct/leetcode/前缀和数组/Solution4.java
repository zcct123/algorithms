package com.zclvct.leetcode.前缀和数组;

import java.util.HashMap;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 525. 连续数组
 * @date 2022/7/14 20:03
 */
public class Solution4 {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int pre_sum = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            pre_sum += nums[i] == 1 ? 1 : -1;
            int pre_index = map.getOrDefault(pre_sum, i);
            if (pre_index == i) {
                map.put(pre_sum, i);
            } else {
                ret = Math.max(ret, i - pre_index);
            }
        }
        return ret;

    }

}
