package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 27. 移除元素
 * @date 2022/7/16 21:25
 */
public class Solution2 {

    public static int removeElement(int[] nums, int val) {

        int fast = 0;
        int slow = 0;

        while (fast < nums.length) {
            if(nums[fast] != val) {
                nums[slow] = val;
                slow++;
            }
            fast ++;
        }
        return slow;

    }

    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3},3);
    }
}
