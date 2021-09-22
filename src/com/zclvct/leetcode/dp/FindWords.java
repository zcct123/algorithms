package com.zclvct.leetcode.dp;

import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。
 *
 * 单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
 *
 * 链接：https://leetcode-cn.com/problems/word-search-ii
 * @date 2021/9/16 8:39
 */
public class FindWords {
    // todo 待我 学一学回溯算法再写
    // 回溯算法
    public List<String> findWords(char[][] board, String[] words) {
        return null;
    }


    // 八皇后的问题
    public int EightQueens(int width) {
        int[]  notX = new int[8];
        int[]  notY = new int[8];
        // x/y + x%y ? 表示斜线？
        int[]  notXY = new int[8];

        for (int i = 0; i < width/2; i++) {
            int number = 0;
            while (number < width)
            {

            }
        }
        return 0;
    }

}
