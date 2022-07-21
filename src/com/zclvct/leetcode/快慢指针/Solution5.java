package com.zclvct.leetcode.快慢指针;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 5. 最长回文子串
 * @date 2022/7/16 22:00
 */
public class Solution5 {

    public String longestPalindrome(String s) {

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // 以 s[i] 为中⼼的最⻓回⽂⼦串
            String s1 = palindrome(s, i, i);
            // 以 s[i] 和 s[i+1] 为中⼼的最⻓回⽂⼦串
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    // 在 s 中寻找以 s[l] 和 s[r] 为中⼼的最⻓回⽂串
    String palindrome(String s, int l, int r) {
        // 防⽌索引越界
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            // 双指针，向两边展开
            l--;
            r++;
        }
        // 返回以 s[l] 和 s[r] 为中⼼的最⻓回⽂串
        return s.substring(l + 1, r);
    }
}
