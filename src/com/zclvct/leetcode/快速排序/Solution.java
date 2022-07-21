package com.zclvct.leetcode.快速排序;

import static edu.princeton.cs.algs4.StdRandom.shuffle;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 215. 数组中的第K个最大元素
 * @date 2022/7/20 19:48
 */
public class Solution {

    public static void sort(int[] nums) {
        // 排序整个数组（原地修改）
        sort(nums, 0, nums.length - 1);
    }
    static void sort(int[] nums, int left, int right) {
        if(left >= right)return;

        int p = partition(nums, left, right);

        sort(nums, left, p - 1);
        sort(nums, p + 1, right);
    }

    // 对 nums[lo..hi] 进行切分
    private static int partition(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        // 关于区间的边界控制需格外小心，稍有不慎就会出错
        // 我这里把 i, j 定义为开区间，同时定义：
        // [lo, i) <= pivot；(j, hi] > pivot
        // 之后都要正确维护这个边界区间的定义
        int i = lo + 1, j = hi;
        // 当 i > j 时结束循环，以保证区间 [lo, hi] 都被覆盖
        while (i <= j) {
            while (i < hi && nums[i] <= pivot) {
                i++;
                // 此 while 结束时恰好 nums[i] > pivot
            }
            while (j > lo && nums[j] > pivot) {
                j--;
                // 此 while 结束时恰好 nums[j] <= pivot
            }
            // 此时 [lo, i) <= pivot && (j, hi] > pivot

            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        // 将 pivot 放到合适的位置，即 pivot 左边元素较小，右边元素较大
        swap(nums, lo, j);
        return j;
    }

    public static void main(String[] args) {
       int[] arr =  new int[]{5,2,3,1};
        sort(arr);

        System.out.println(arr);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
