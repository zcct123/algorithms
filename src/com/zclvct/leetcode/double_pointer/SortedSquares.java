package com.zclvct.leetcode.double_pointer;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 *
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 *  
 *
 * 进阶：
 *
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/24 11:31
 */
public class SortedSquares {
    /**
     * 由于原数组的顺序是有序的， 平方之后  会存在 两段有序的部分 ，这两段有序的部分可以利用双指针的方式去排序
     */
    public static int[] sortedSquares(int[] nums) {
        // 找到复数临界点
        int criticalPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
            {
               // nums[i] = nums[i] * nums[i];
                criticalPoint = i;
            }else {
                break;
            }
        }
        // 双指针合并
        int[] temp = new int[nums.length];
        int mid = criticalPoint;
        int left = mid;
        int right = mid+1;
        int t = 0;
        while (left >= 0 && right <= nums.length - 1)
        {
            temp[t++] = nums[left]*nums[left] < nums[right]*nums[right]? nums[left]*nums[left--] : nums[right]*nums[right++];
        }
        while (left >= 0)
        {
            temp[t++] = nums[left]*nums[left--];
        }
        while (right <= nums.length - 1)
        {
            temp[t++] = nums[right]*nums[right++];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-5};
        System.out.println(sortedSquares(arr));
    }
}
