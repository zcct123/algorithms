package com.zclvct.leetcode;

import java.util.*;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 *
 * 给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 *
 * 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
 *
 * @date 2021/9/14 8:27
 */



public class FindLongestWord {

    // 最容易实现的方式当然是去一个对比呀  感觉这么写自己很捞

    //
    public static String findLongestWord1(String s, List<String> dictionary) {

        String res = "";
        for (int i = 0; i < dictionary.size(); i++) {
            // 求是否为子序列
            if(isSubsequence(s , dictionary.get(i)))
            {
                String s1 = dictionary.get(i);
                //  返回长度最长  字典序列最小的字符串 -  字典序列最小的代表的是值最小
                if(s1.length() > res.length() || (s1.length() == res.length() && s1.compareTo(res) < 0))
                {
                    res = s1;
                }
            }

        }
        return res;
    }

    /**
     *  1. 用来判断是不是子序列
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String t, String s) {

        int i = 0,j = 0;
        while (i < s.length() && j < t.length())
        {
            if (s.charAt(i) == t.charAt(j))
            {
                ++i;
            }
            ++j;
        }
        if( i == s.length())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] dictionary = new String[]{"abe","abc"};
        System.out.println(findLongestWord1("abce", Arrays.asList(dictionary)));
    }

}
