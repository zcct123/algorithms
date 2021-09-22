package com.zclvct.leetcode.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 *      
 *
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *      
 *
 * 提示：
 *
 * 各函数的调用总次数不超过 20000 次
 *
 *
 * 链接：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof
 *
 * @date 2021/9/18 16:14
 */
public class MinStack {
    /** initialize your data structure here. */

    Stack<Integer> stack1, stack2;
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty())
        {
            stack2.push(x);
        }else if(stack2.peek() > x){
            stack2.push(x);
        }
    }

    public void pop() {
        Integer pop = stack1.pop();
        if(stack2.peek().equals(pop)){
            stack2.pop();
        }
    }

    public int top() {
       return stack1.pop();
    }

    public int min() {
        return stack2.pop();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
