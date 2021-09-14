package com.zclvct.v1.v1v1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 二分查找  java BinarySearch tinyW.txt < tinyT.txt
 * @date 2021/9/8 19:42
 */
public class BinarySearch {

    /**
     * 二分查找
     *
     * @param key
     * @param arr
     * @return
     */
    public static int rank(int key, int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (key < arr[mid]) {
                max = mid - 1;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            // 读取键值， 如果不存在于白名单那中则将其打印
            int key = StdIn.readInt();
            int i = rank(key, whitelist);
            StdOut.println(i);

        }
    }
}
