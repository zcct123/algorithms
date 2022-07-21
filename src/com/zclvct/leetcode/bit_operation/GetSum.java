package com.zclvct.leetcode.bit_operation;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给你两个整数 a 和 b ，不使用 运算符 + 和 - ，计算并返回两整数之和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：a = 1, b = 2
 * 输出：3
 * 示例 2：
 *
 * 输入：a = 2, b = 3
 * 输出：5
 *  
 *
 * 提示：
 *
 * -1000 <= a, b <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/26 8:45
 */
public class GetSum {
    public static int getSum(int a, int b) {
        int i = 0;
        int j = 0;
        // 这里 判断的是进位   进位是 0 时 a|b 就是正确结果
        while ((a & b) != 0)
        {
            // 相加不进位
            i = a ^ b;
            // 进位左移
            j = (a & b) << 1;
            a = i;
            b = j;
        }
        return a | b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }
}
