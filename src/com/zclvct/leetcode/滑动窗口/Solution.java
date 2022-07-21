package com.zclvct.leetcode.滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 3. 无重复字符的最长子串
 * @date 2022/7/17 12:05
 */
public class Solution {

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int min_length = Integer.MIN_VALUE;

        while (right < s.length()) {
            char c = s.charAt(right);
            right ++;

            window.put(c,window.getOrDefault(c,0)+1);

            while (window.get(c) >1) {
                char c1 = s.charAt(left);
                left ++;
                window.put(c1,window.getOrDefault(c,0)-1);
            }
            min_length = right - left > min_length ? right-left:min_length;
        }

        return min_length == Integer.MIN_VALUE ? 0:min_length;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("aab");
    }
}
