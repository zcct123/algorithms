package com.zclvct.disordered;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 计算两个非负数的 最大公约数
 *          欧几里得算法
 *        计算两个非负数的 q 和 p 的最大公约数 ， 若 q 是 0 则最大公约数为 p
 *        否则，将 p 除以 q 得到的余数 r ， p 和 q 的 最大公约数即为 q 和 r 的最大公约数
 * @date 2021/9/6 21:22
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println( gcb(16,20));
    }

    private static int gcb(int p, int q) {
        if( q == 0 )
            return p ;
        int r = p % q;
        return gcb(q,r);
    }
}
