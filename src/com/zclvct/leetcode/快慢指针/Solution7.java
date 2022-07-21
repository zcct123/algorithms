package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 80. 删除有序数组中的重复项 II
 * @date 2022/7/16 23:38
 */
public class Solution7 {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;


        int count = 1;

        while (right < n) {
            if(nums[right] == nums[left] && count < 3) {
                nums[left] = nums[right];
                right++;
                count++;
            }else {
                count = 1;
            }
            right++;
        }
        return left+1;
    }
}
