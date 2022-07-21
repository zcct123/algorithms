package com.zclvct;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2022/7/10 13:15
 */
public class Solution11 {

    public static int strStr(String haystack, String needle) {
        if (needle == "") {
            return -1;
        }

        if(haystack.length() < needle.length()) {
            return 0;
        }

        for( int i = 0 ; i < haystack.length() &&  haystack.length() - i >= needle.length(); i++) {

            for( int j = 0 ; j < needle.length() ; j++) {
                if(j == (needle.length() - 1) && needle.charAt(j) == haystack.charAt(j+i)) {
                    return i;
                }

                if(needle.charAt(j) != needle.charAt(j+i)) {
                    break;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       strStr("hello", "ll");
    }
}
