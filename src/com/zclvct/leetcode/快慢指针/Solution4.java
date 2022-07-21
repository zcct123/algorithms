package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 167. 两数之和 II - 输入有序数组
 * @date 2022/7/16 21:47
 */
public class Solution4 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left < right)
        {
            int count = numbers[left] + numbers[right];
            if(count > target)
            {
                right--;
            }else if(count < target)
            {
                left++;
            }else {
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }
}
