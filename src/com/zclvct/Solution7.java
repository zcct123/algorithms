package com.zclvct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给你一个由 n 个整数组成的数组    nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组    [nums[a], nums[b], nums[c], nums[d]]    （若两个四元组元素一一对应，则认为两个四元组重复）：
 *
 * 0 <= a, b, c, d    < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 *
 *     
 *
 * 示例 1：
 *
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 示例 2：
 *
 * 输入：nums = [2,2,2,2,2], target = 8
 * 输出：[[2,2,2,2]]
 *     
 *
 * 提示：
 *
 * 1 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 *
 * @date 2022/7/8 21:17
 */
public class Solution7 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
 int length = nums.length;
        List<List<Integer>>  list = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if( i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }


            for (int j = i + 1 ; j < nums.length - 2; j++) {
                if( j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1 ;
                int r = nums.length -1;

                while (l < r) {

                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target) {
                        list.add(Arrays.asList(new Integer[] {nums[i] , nums[j] , nums[l] , nums[r]}));
                        while ( l < r && nums[l] == nums[l + 1]) {
                            l ++;
                        }
                        while ( r > j && nums[r] == nums[r - 1]) {
                            r --;
                        }
                        l ++;
                        r --;
                    } else if (sum < target) {
                        l ++;

                    }else {
                        r --;
                    }

                }


            }


        }

        return list;
    }

    public static void main(String[] args) {
        fourSum(new int[]{1000000000,1000000000,1000000000,1000000000} , -294967296);
    }
}
