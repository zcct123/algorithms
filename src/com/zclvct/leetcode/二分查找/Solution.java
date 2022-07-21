package com.zclvct.leetcode.二分查找;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 * @date 2022/7/13 20:02
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }
    int left_bound(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int mid = l + (r - l)/2;
            if(nums[mid] > target) {
                l = mid + 1;
            }else if(nums[mid] < target) {
                r =  mid;
            } else if (nums[mid] == target) {
                r =  mid;
            }
        }
        return l ;
    }

    int right_bound(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n;

        while (l < r) {
            int mid = l + (r - l)/2;
            if(nums[mid] > target) {
                l = mid + 1;
            }else if(nums[mid] < target) {
                r =  mid;
            } else if (nums[mid] == target) {
                l  = mid + 1;
            }
        }
        return l -1;
    }
}
