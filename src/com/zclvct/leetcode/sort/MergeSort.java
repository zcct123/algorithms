package com.zclvct.leetcode.sort;

import java.util.Arrays;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 归并排序
 * @date 2021/9/24 10:36
 */
public class MergeSort {
    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr,temp,0,arr.length-1);
    }
    private static void sort(int[] arr,int[] temp,int left, int right) {
        if(left < right)
        {
            int mid = (left+right) - 1;
            // 左边递归
            sort(arr,temp,left,mid);
            // 右边
            sort(arr,temp,mid+1,right);
            // 合并
            merge(arr,left,mid,right,temp);
        }

    }

    /**
     *  这里因为递归 left - mid 之间是有序的  mid + 1 - right 之间也是有序的 需要对这两个进行排序
     */
    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        // temp 数组指针 用于葫芦下一个元素存放的位置
        // 这里存放 为left更好理解
        int t = left;
        // 双指针依次比较大小
        while (i <= mid && j<= right)
        {
            temp[t++] = arr[i] <= arr[j] ? arr[i++]:arr[j++];
        }
        // 两段数组比较  最后肯定有一个数组剩余1个 或者更多
        // 处理剩余部分
        while (i <= mid)
        {
            temp[t++] = arr[i++];
        }
        while (j <= mid)
        {
            temp[t++] = arr[j++];
        }

        // 拷贝回原数组
        while (left <= right)
        {
            arr[left] = temp[left];
            left++;

        }
    }

}
