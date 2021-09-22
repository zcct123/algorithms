package com.zclvct.leetcode.dp;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 * 示例 2:
 *
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 * 注意：给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 *
 * 链接：https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence
 * @date 2021/9/20 15:22
 */
public class FindNumberOfLIS {

    public static int findNumberOfLIS(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }

    /**
     * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
     *
     * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
     *
     *   
     * 示例 1：
     *
     * 输入：nums = [10,9,2,5,3,7,101,18]
     * 输出：4
     * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
     * 示例 2：
     *
     * 输入：nums = [0,1,0,3,2,3]
     * 输出：4
     * 示例 3：
     *
     * 输入：nums = [7,7,7,7,7,7,7]
     * 输出：1
     *   
     *
     * 提示：
     *
     * 1 <= nums.length <= 2500
     * -104 <= nums[i] <= 104
     *   
     *
     * 进阶：
     *
     * 你可以设计时间复杂度为 O(n2) 的解决方案吗？
     * 你能将算法的时间复杂度降低到  O(n log(n)) 吗?
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */

    public int lengthOfLIS(int[] nums) {
        return 1;
    }
    
    public static void main(String[] args) {
        System.out.println(findNumberOfLIS(new int[]{1,3,5,4,7}));
    }
}
