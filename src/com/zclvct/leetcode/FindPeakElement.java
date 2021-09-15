package com.zclvct.leetcode;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 *
 * 峰值元素是指其值严格大于左右相邻值的元素。
 *
 * 给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 *
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 *
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 *
 *  这个题值得解析：
 *  1. 迭代爬坡
 *     把数组看成迭代的山脉  已知的是山脉的两端都是悬崖，两端的高度都比悬崖高，
 *     那么可以认为，从上山任意一点触发，一直往高处行走 ，就可以找到山顶，但是这个山顶不一定是最高的
 *  2. 二分法增强
 *      通过缩小起点的范围降低爬坡的计算率
 * @date 2021/9/15 9:52
 */
public class FindPeakElement {

    /*
     * 二分法爬坡
     */
    public static int binSearch(int[] nums) {
        int min = 0;
        int max = nums.length ;
        int mid = (min + max)/2;
        while (!(compare(nums,mid,mid-1) == 1 && compare(nums,mid,mid+1) == 1))
        {
            // 右侧是上坡
            if(compare(nums,mid,mid-1) == 1)
            {
                min = mid;
                mid = (min + max)/2;
            }
            // 左侧是上坡  或者  两侧都是上坡
            else {
                max = mid;
                mid = (min + max)/2;
            }
        }
        return nums[mid];

    }

    /*
     * 参靠官网解析使用 迭代爬坡 的方式
     */
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int idx = (int) (Math.random() * n);
        //  条件是到达坡顶
        while (!(compare(nums,idx,idx-1) == 1 && compare(nums,idx,idx+1) == 1))
        {
            // 右侧是上坡
            if(compare(nums,idx,idx-1) == 1)
            {
                idx ++;
            }
            // 左侧是上坡  或者  两侧都是上坡
            else {
                idx --;
            }
        }
        return nums[idx];
    }

    public static int compare(int[] nums,int idx,int j)
    {
        if( j < 0 || j >  nums.length - 1 )
        {
            return 1;
        }else {
            return Integer.compare(nums[idx],nums[j]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,2,4,8,4,7,9,3,1};
        int[] arr1 = new int[]{2,1};
        System.out.println( findPeakElement(arr1));
        System.out.println( binSearch(arr1));
    }
}
