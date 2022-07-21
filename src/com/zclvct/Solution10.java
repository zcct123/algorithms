package com.zclvct;

import java.util.Stack;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']'  的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *   
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例  2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例  3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例  4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例  5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/7/10 12:08
 */
public class Solution10 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }

}
