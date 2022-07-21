package com.zclvct.leetcode.归并排序;

import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 912. 排序数组  归并排序
 * @date 2022/7/19 19:22
 */
public class Solution {

    private  int[] temp ;
    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        sort(nums , 0 ,nums.length-1);
        return nums;
    }
    void sort(int[] nums , int left , int  right) {

        if(left == right) {
            return;
        }
        int mid = left + (right - left) /2;
        sort(nums,left , mid);
        sort(nums,mid + 1 , right);
        merge(nums , left ,mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        int i = left, j = mid + 1;

        for (int k = left; k <= right; k++) {

            if(i == mid + 1) {
                // 左半边数组已全部被合并
                nums[k] = temp[j++];
            }else if (j == right + 1) {
                // 右半边数组已全部被合并
                nums[k] = temp[i++];
            }else if (temp[i] > temp[j]) {
                nums[k] = temp[j++];
            } else {
                nums[k] = temp[i++];
            }
        }

    }

}
