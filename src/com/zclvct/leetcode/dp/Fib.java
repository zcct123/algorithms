package com.zclvct.leetcode.dp;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 斐波那契数，通常用    F(n) 表示，形成的序列称为 斐波那契数列 。该数列由    0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0，F(1)    = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 *     
 *
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 
 * @date 2021/9/18 15:10
 */
public class Fib {

    public static int fib(int n) {
        if(n < 2)
        {
            return n;
        }


        int last2 = 0;
        int last1 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = last1 + last2;
            last2 = last1;
            last1 = temp;
        }

        return last1;

    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
