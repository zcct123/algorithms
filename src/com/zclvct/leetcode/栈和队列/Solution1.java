package com.zclvct.leetcode.栈和队列;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 921. 使括号有效的最少添加
 * @date 2022/7/18 19:51
 */
public class Solution1 {

    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(') {
                deque.push('(');
            }else {
                if(deque.isEmpty()) {
                    count ++;
                }else {
                    deque.pop();
                }
            }
        }

        return count + deque.size();
    }
}
