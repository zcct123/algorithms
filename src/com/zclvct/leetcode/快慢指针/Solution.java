package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 26. 删除有序数组中的重复项
 * @date 2022/7/16 21:02
 */
public class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 维护 nums[0..slow] ⽆重复 \
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组⻓度为索引 + 1
        return slow + 1;
    }
}
