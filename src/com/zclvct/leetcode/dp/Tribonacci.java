package com.zclvct.leetcode.dp;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 1137. 第 N 个泰波那契数
 * 泰波那契序列 Tn 定义如下：
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 * 链接：https://leetcode-cn.com/problems/n-th-tribonacci-number/
 *
 * @date 2021/9/18 15:21
 */
public class Tribonacci {

    public static int tribonacci(int n) {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1 || n == 2)
        {
            return 1;
        }
        int n3 = 0,n2 = 1,n1 = 1;
        for (int i = 3; i <= n; i++) {
            int temp = n3;
            n3 = n2;
            n2 = n1;
            n1 = n2 + n3 + temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
