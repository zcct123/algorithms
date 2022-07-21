package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 80. 删除有序数组中的重复项 II
 * @date 2022/7/16 23:55
 */
public class Solution8 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 2) {
            return 2;
        }
        int left = 2;
        int right = 2;



        while (right < n) {
           if(nums[right] != nums[left- 2]) {
               nums[left] = nums[right];
               left ++;
           }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
}
