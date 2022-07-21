package com.zclvct.leetcode.栈和队列;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 20. 有效的括号
 * @date 2022/7/18 19:42
 */
public class Solution {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            //左括号入栈
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
                //碰到右括号的情况
            else{
                // 栈为空，false
                if(stack.isEmpty())
                    return false;
                    // 栈不为空，但栈顶元素不匹配，false
                else if(c == ')' && stack.pop() != '(' || c == ']' && stack.pop() != '[' || c == '}' && stack.pop() != '{')
                    return false;
            }
        }
        // 左括号有剩余
        // 字符序列遍历完，但是栈不为空，则也不是合法的序列
        return stack.isEmpty();
    }
}
