package com.zclvct.leetcode;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 * @date 2021/9/14 14:45
 */
public class IsPalindrome {
    // 利用字符串 反转？
    // 进阶：你能不将整数转为字符串来解决这个问题吗？

    public static boolean isPalindrome1(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;

    }

    // 这个方法就是反转整数 但是 执行用时和内存消耗都很高
    public static boolean isPalindrome(int x) {
        // 小于零 或者 个位是零 不可能是回文整数
        if (x < 0 || (x % 10 == 0 ))
        {
            return false;
        }
        if(x < 10)
        {
            return true;
        }
        int y = 0;
        int length = String.valueOf(x).length();
        for (int i = 0; i < length/2; i++) {
            int latest = (int)Math.pow(10, i);
            int original = (int)Math.pow(10, length - 1 - i);
            y += x / original * latest ;
            x -= x / original * original ;
        }
        return y == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1(121));
    }
}
