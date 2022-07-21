package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 283. 移动零
 * @date 2022/7/16 21:33
 */
public class Solution3 {

    public static void moveZeroes(int[] nums) {

        int fast = 0;
        int slow = 0;

        while (fast < nums.length) {
            if(nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow ++;
            }
            fast++;
        }
        for ( ; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
