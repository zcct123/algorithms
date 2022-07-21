package com.zclvct.leetcode.滑动窗口;

import com.zclvct.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 438. 找到字符串中所有字母异位词
 * @date 2022/7/17 13:57
 */
public class Solution3 {

    public static List<Integer> findAnagrams(String s, String p) {

        Map<Character , Integer> need = new HashMap<>();
        Map<Character , Integer> window = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < p.toCharArray().length; i++) {
            need.put(p.charAt(i) , need.getOrDefault(p.charAt(i), 0)+1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)) {
                window.put(c , window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))) {
                    valid ++;
                }
            }

            while (right - left >= p.length()) {
                if(valid == need.size()) {
                    res.add(left);
                }
                char c1 = s.charAt(left);
                left ++;
                if(need.containsKey(c1)) {
                   if(window.get(c1).equals(need.get(c1))) {
                       valid --;
                   }
                   window.put(c1,window.get(c1) -1);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        findAnagrams("baa","aa");
    }
}
