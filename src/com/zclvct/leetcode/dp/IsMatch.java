package com.zclvct.leetcode.dp;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *

 * @date 2021/9/14 17:03
 */
public class IsMatch {

    // todo
    public static boolean isMatch(String s, String p) {

        char[] charS = s.toCharArray();
        char[] charP = p.toCharArray();
        int i = 0;
        int j = 0;
        while ( i < s.length())
        {
            if( j >= p.length())
            {
                return false;
            }
            switch (charP[j]){
                case '.':
                    ++j;
                    break;
                case '*':
                    if(charS[i] == charP[j-1] || charP[j-1] == '.')
                    {
                        break;
                    }else {
                        ++j;
                        --i;
                        break;
                    }
                default:
                    if(charS[i] == charP[j])
                    {
                        ++j;
                        break;
                    }else {
                        if( j+1 < p.length())
                        {
                            return charP[j+1] == '*';
                        }else {
                            return false;
                        }

                    }
            }
            ++i;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMatch("ab",".*"));
    }
}
