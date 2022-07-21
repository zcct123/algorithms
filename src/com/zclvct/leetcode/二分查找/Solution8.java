package com.zclvct.leetcode.二分查找;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 870. 优势洗牌
 * @date 2022/7/17 16:55
 */
public class Solution8 {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        PriorityQueue<int[]> maxpq = new PriorityQueue<>(
                (int[] pair1, int[] pair2) -> {
                    return pair2[1] - pair1[1];
                }
        );
        for (int i = 0; i < nums2.length; i++) {
            maxpq.offer(new int[]{i, nums2[i]});
        }

        int left = 0, right = nums1.length - 1;
        int[] res = new int[nums1.length];


        while (!maxpq.isEmpty()) {
            int[] poll = maxpq.poll();
            int i =  poll[0];
            int pow = poll[1];

            if(pow >= nums1[right]) {

                res[i] = nums1[left];
                left ++;

            }else {
                res[i] = nums1[right];
                right --;
            }
        }

        return res;
    }

}
