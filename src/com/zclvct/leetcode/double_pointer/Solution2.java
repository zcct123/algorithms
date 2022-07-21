package com.zclvct.leetcode.double_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * @date 2022/7/6 19:47
 */
public class Solution2 {

    /**
     * 思路
     * 标签：数组遍历
     * 首先对数组进行排序，排序后固定一个数 nums[i]，再使用左右指针指向 nums[i]后面的两端，数字分别为 nums[L] 和 nums[R]，计算三个数的和 sum 判断是否满足为 0，满足则添加进结果集
     * 如果 nums[i]大于 0，则三数之和必然无法等于 00，结束循环
     * 如果 nums[i] == nums[i−1]，则说明该数字重复，会导致结果重复，所以应该跳过
     * 当 sum == 0 时，nums[L] == nums[L+1] 则会导致结果重复，应该跳过，L++
     * 当 sum == 0 时，nums[R] == nums[R−1] 则会导致结果重复，应该跳过，R−−
     * 时间复杂度：O(n^2)O(n
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;

        for (int i = 0; i < len - 2; ++i) {
            if (nums[i] > 0) return lists;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            int L = i + 1;
            int R = len - 1;

            while (R > L) {
                if (nums[i] + nums[L] + nums[R] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;

                } else if (nums[i] + nums[L] + nums[R] < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, -1, -1, 0};
        threeSum(arr);
    }
}
