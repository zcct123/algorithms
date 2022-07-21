package com.zclvct.leetcode.差分数组;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 这里有  n  个航班，它们分别从 1 到 n 进行编号。
 *
 * 有一份航班预订表  bookings ，表中第  i  条预订记录  bookings[i] = [firsti, lasti, seatsi]  意味着在从 firsti  到 lasti （包含 firsti 和 lasti ）的 每个航班 上预订了 seatsi  个座位。
 *
 * 请你返回一个长度为 n 的数组  answer，里面的元素是每个航班预定的座位总数。
 *
 *   
 *
 * 示例 1：
 *
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 * 解释：
 * 航班编号        1   2   3   4   5
 * 预订记录 1 ：   10  10
 * 预订记录 2 ：       20  20
 * 预订记录 3 ：       25  25  25  25
 * 总座位数：      10  55  45  25  25
 * 因此，answer = [10,55,45,25,25]
 * 示例 2：
 *
 * 输入：bookings = [[1,2,10],[2,2,15]], n = 2
 * 输出：[10,25]
 * 解释：
 * 航班编号        1   2
 * 预订记录 1 ：   10  10
 * 预订记录 2 ：       15
 * 总座位数：      10  25
 * 因此，answer = [10,25]
 *   
 *
 * 提示：
 *
 * 1 <= n <= 2 * 104
 * 1 <= bookings.length <= 2 * 104
 * bookings[i].length == 3
 * 1 <= firsti <= lasti <= n
 * 1 <= seatsi <= 104
 *
 * @date 2022/7/12 19:57
 */
public class Solution {

    public int[] corpFlightBookings(int[][] bookings, int n) {
       // int[] res = new int[n];
        int[] diff = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int r =  bookings[i][0];
            int l =  bookings[i][1];
            int count =  bookings[i][2];
            diff[r - 1] += count;
            if( l  < diff.length) {
                diff[l] -= count;
            }
        }

        for (int i = 1; i < diff.length; i++) {
            diff[i] = diff[i] + diff[i - 1];
        }
        return diff;
    }
}
