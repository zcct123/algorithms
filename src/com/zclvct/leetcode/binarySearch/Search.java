package com.zclvct.leetcode.binarySearch;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给定一个  n  个元素有序的（升序）整型数组  nums 和一个目标值  target   ，写一个函数搜索  nums  中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 *
 * @date 2021/9/18 9:25
 */
public class Search {

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length;
        while (low <= high)
        {
            // 防止超出整数范围
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));
    }
}
