package com.zclvct.leetcode.滑动窗口;

import java.util.HashMap;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 567. 字符串的排列
 * @date 2022/7/17 13:22
 */
public class Solution2 {

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character , Integer> need = new HashMap<>();

        HashMap<Character , Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int valid = 0;

        for (int i = 0; i < s2.toCharArray().length; i++) {
            need.put(s2.charAt(i) , need.getOrDefault(s2.charAt(i), 0) +1);
        }

        while (right < s1.length()) {
            char c = s1.charAt(right);
            right ++;

            if(need.containsKey(c)) {
                window.put(c,window.getOrDefault(c, 0) +1);
                if(need.get(c).equals(window.get(c))) {
                    valid++;
                }
            }

            //判断是否要收缩
            while(right - left >= s1.length()){
                if (valid == need.size())
                    return true;
                char d = s1.charAt(left);
                left++;

                window.put(d,window.get(d) -1);
                if(window.get(d) < need.get(d)) {
                    valid --;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        checkInclusion( "eidbaooo","ab");
    }
}
