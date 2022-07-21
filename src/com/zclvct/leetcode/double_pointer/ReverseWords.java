package com.zclvct.leetcode.double_pointer;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *      
 *
 * 示例：
 *
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *      
 *
 * 提示：
 *
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/24 17:11
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            String s2 = reverseString(s1[i].toCharArray());
            stringBuilder.append(s2);
            if(i< s1.length )
            {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static String reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right)
        {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
