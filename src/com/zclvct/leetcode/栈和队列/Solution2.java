package com.zclvct.leetcode.栈和队列;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 1541. 平衡括号字符串的最少插入次数
 * @date 2022/7/18 20:02
 */
public class Solution2 {

    public int minInsertions(String s) {
        char[] chars = s.toCharArray();
        int res = 0, need = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                need += 2;
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            }
            if (chars[i] == ')') {
                need--;
                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need;
    }

}
