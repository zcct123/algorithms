package com.zclvct.leetcode.归并排序;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 493. 翻转对
 * @date 2022/7/19 20:08
 */
public class Solution2 {

    int[] temp;
    int count = 0;
    public int reversePairs(int[] nums) {
        if(nums.length == 0) {
            return count;
        }
        temp = new int[nums.length];
        sort(nums , 0 , nums.length -1);
        return count;

    }

    void sort(int[] nums , int left , int right) {

        if(left >= right) {
            return;
        }
        int mid = left + (right -left)/2;

        sort(nums , left , mid);
        sort(nums , mid + 1 , right);
        merge(nums , left , mid , right);
    }

    void merge(int[] nums , int left ,int mid , int right) {

        for (int i = left; i <= right; i++) {

            temp[i] = nums[i];

        }

        int end = mid + 1;
        for (int i = left; i <= mid; i++) {
            // nums 中的元素可能较大，乘 2 可能溢出，所以转化成 long
            while (end <= right && (long)nums[i] > (long)nums[end] * 2) {
                end++;
            }
            count += end - (mid + 1);
        }

        int i = left;
        int j = mid + 1;
        for (int k = left; k <= right; k++) {
            if(i == mid + 1) {
                nums[k] = temp[j++];
            }else if(j == right + 1) {
                nums[k] = temp[i++];
            }else if(temp[i] <= temp[j]) {
                nums[k] = temp[i++];
            }else {
                nums[k] = temp[j++];
            }
        }


    }

}
