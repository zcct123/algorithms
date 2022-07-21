package com.zclvct.leetcode.去除重复字母;

import edu.princeton.cs.algs4.Stack;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 316. 去除重复字母
 * @date 2022/7/17 21:40
 */
public class Solution {
    public String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        boolean[] hasChar = new boolean[256];
        int[] count  = new int[256];

        for (int i = 0; i < s.toCharArray().length; i++) {
            count[s.charAt(i)] += 1;
        }

        for (int i = 0; i < s.toCharArray().length; i++) {

            char c = s.charAt(i);
            // 每遍历过一个字符，都将对应的计数减一
            count[c]--;

            if(hasChar[c]) {
               continue;
            }

            while (!stack.isEmpty() && stack.peek() > c) {
                Character peek = stack.peek();
                if(count[peek] > 1) {
                    stack.pop();
                }else {
                    break;
                }
            }

            stack.push(c);
            hasChar[c] = true;

        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();

    }
}
