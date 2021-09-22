package com.zclvct.leetcode.data_structure;

import java.util.*;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 链接： https://leetcode-cn.com/problems/contains-duplicate/
 * @date 2021/9/18 12:57
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(set.contains(nums[i]))
//            {
//                return true;
//            }else {
//                set.add(nums[i]);
//            }
//        }
//        return false;

        return Arrays.stream(nums).distinct().count() != nums.length;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}
