package com.zclvct;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2022/7/7 21:24
 */
public class Solution3 {

    public static String longestCommonPrefix(String[] strs) {

        String res = "";

        char temp = ' ';
        char[] arr = strs[0].toCharArray();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int i1 = 0; i1 < strs.length; i1++) {
                if(i+1 > strs[i1].length()) {
                    return  res;
                }
                if (strs[i1].toCharArray()[i] != arr[i]) {
                    return  res;
                }else if(i1 == strs.length - 1) {
                    flag = true;
                }
            }
            if(flag) {
                res = res + arr[i];
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"aa","aa"});
    }
}
