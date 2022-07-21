package com.zclvct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 数字 n   代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *    
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *    
 *
 * 提示：
 *
 * 1 <= n <= 8
 *
 * @date 2022/7/8 20:46
 */
public class Solution6 {

    public static List<String> generateParenthesis(int n) {
        int left = n;
        int right = n;

        List<String> res = new ArrayList<>();
        back(res, 1 ,1,"",n);
        return res;
    }

    static  void back (List<String> res , int l , int r , String str , int n) {
        if(l == n) {
            res.add(str + "(");
        }
        if(r == n) {
            res.add(str + ")");
        }

        if(l == n && r == n){
            return;
        }

        {
            back(res , l + 1 , r, str + "(" , n);
            back(res , l,r + 1 , str + ")" , n);
        }

    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
