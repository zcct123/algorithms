package com.zclvct.leetcode.滑动窗口;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 76. 最小覆盖子串
 * @date 2022/7/17 12:11
 */
public class Solution1 {

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();// 统计所需字符及其数量
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();// 统计窗口内的字符及其数量
        int valid = 0;// 满足条件的字符数
        int l = 0, r = 0;// left-right pointers
        int min_LEN = Integer.MAX_VALUE, min_LEFT = 0;//记录最小窗口的长度和开始位置
        while (r < s.length()) {
            // 扩大右边界
            char ch = s.charAt(r);
            r++;
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (window.get(ch).equals(need.get(ch))) {
                valid++;
            }

            // 满足条件时缩小窗口
            while (valid == need.size()) {
                // 记录当前窗口
                if (r - l < min_LEN) {
                    min_LEN = r - l;
                    min_LEFT = l;
                }

                // 缩小左边界
                char c = s.charAt(l);
                if (window.get(c).equals(need.get(c))) {
                    valid--;
                }
                window.put(c, window.get(c) - 1);
                l++;
            }
        }
        return min_LEN == Integer.MAX_VALUE ? "" : s.substring(min_LEFT, min_LEFT + min_LEN);
    }
}
