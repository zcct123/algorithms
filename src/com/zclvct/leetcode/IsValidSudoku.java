package com.zclvct.leetcode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * <p>
 * 注意：
 * <p>
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * <p>
 * <p>
 * 链接：https://leetcode-cn.com/problems/valid-sudoku
 * @date 2021/9/17 11:23
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int[][] arr = new int[29][10];
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[i].length; i1++) {
                if(board[i][i1] == '.')
                {
                    continue;
                }
                Integer index = Integer.valueOf(board[i][i1]+"");
                if(arr[i][index] == 0)
                {
                    arr[i][index] = 1;
                }else {
                    return false;
                }
                if(arr[i1+9][index] == 0)
                {
                    arr[i1+9][index] = 1;
                }else {
                    return false;
                }
                int a = i/3*3 + i1/3 + 19;
                if(arr[a][index] == 0)
                {
                    arr[a][index] = 1;
                }else {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] arr = new char[][]{{'5','3','.','.','7','.','.','.','.'},
                                    {'6','.','.','1','9','5','.','.','.'},
                                    {'.','9','8','.','.','.','.','6','.'},
                                    {'8','.','.','.','6','.','.','.','3'},
                                    {'4','.','.','8','.','3','.','.','1'},
                                    {'7','.','.','.','2','.','.','.','6'},
                                    {'.','6','.','.','.','.','2','8','.'},
                                    {'.','.','.','4','1','9','.','.','5'},
                                    {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(arr));
    }
}
