package com.zclvct.leetcode.binarySearch;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 链接：https://leetcode-cn.com/problems/search-insert-position

 * @date 2021/9/18 12:43
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int higt = nums.length - 1;
        while (low <= higt)
        {
            int mid = (higt - low)/2 + low;
            int num = nums[mid];
            if(num == target)
            {
                return mid;
            }else if ( num > target ) {
                higt = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return  low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }
}
