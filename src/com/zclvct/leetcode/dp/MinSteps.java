package com.zclvct.leetcode.dp;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 最初记事本上只有一个字符 'A' 。你每次可以对这个记事本进行两种操作：
 *
 * Copy All（复制全部）：复制这个记事本中的所有字符（不允许仅复制部分字符）。
 * Paste（粘贴）：粘贴 上一次 复制的字符。
 * 给你一个数字 n ，你需要使用最少的操作次数，在记事本上输出 恰好 n 个 'A' 。返回能够打印出 n 个 'A' 的最少操作次数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：3
 * 输出：3
 * 解释：
 * 最初, 只有一个字符 'A'。
 * 第 1 步, 使用 Copy All 操作。
 * 第 2 步, 使用 Paste 操作来获得 'AA'。
 * 第 3 步, 使用 Paste 操作来获得 'AAA'。
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= n <= 1000
 *
 * 链接：https://leetcode-cn.com/problems/2-keys-keyboard
 *
 * @date 2021/9/19 11:27
 */
public class MinSteps {

    /**
     * 动态规划
     *      但是计算了很多非因数的步长
     *
     * @param n
     * @return
     */
    public static int minSteps(int n) {
        // 记录所有步长
        int[] f = new int[n + 1];
        for (int i = 2; i <= n; ++i) {
            // 设置最大值 防止比较失效
            f[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; ++j) {
                if (i % j == 0) {
                    // i = j * x
                    // 所以 步长等于  f【x】 + j 或者 f【j】 + x
                    f[i] = Math.min(f[i], f[j] + i / j);
                    f[i] = Math.min(f[i], f[i / j] + j);
                }
            }
        }
        return f[n];

    }

    // 质因数
    public static int minSteps1(int n) {

        if(n == 1) {
            return 0;
        }
        for(short i=1;i<n-1;i++) {
            if(n%(n-i) == 0) {
                return minSteps(n-i) + n/(n-i);
            }
        }
        //如果n为素数，则这个过程唯一不能分解，即操作次数等于n
        return n;
    }

    public static void main(String[] args) {
        System.out.println(minSteps1(18));
    }
}
