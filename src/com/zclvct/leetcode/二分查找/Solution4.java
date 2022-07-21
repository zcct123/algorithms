package com.zclvct.leetcode.二分查找;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 *  
 *
 * 提示：
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/7/14 19:33
 */
public class Solution4 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length;

        while (l < r) {
            int mid = l + (r -l)/2;

            if(matrix[mid][0] > target) {
                r = mid;
            } else if (matrix[mid][0] < target) {
                l = mid + 1;
            }else {
                return true;
            }
        }

        if(l -1 < matrix.length) {
            int a = l-1;
            r = matrix[l].length;
            l = 0 ;
            while (l < r) {
                int mid = l + (r -l)/2;

                if(matrix[a][mid] > target) {
                    r = mid;
                } else if (matrix[a][mid] < target) {
                    l = mid + 1;
                }else {
                    return true;
                }
            }
            return false;
        }else {
            return false;
        }
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        // 把⼆维数组映射到⼀维
        int left = 0, right = m * n - 1;
        // 前⽂讲的标准的⼆分搜索框架
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(get(matrix, mid) == target)
                return true;
            else if (get(matrix, mid) < target)
                left = mid + 1;
            else if (get(matrix, mid) > target)
                right = mid - 1;
        }
        return false;
    }
    // 通过⼀维坐标访问⼆维数组中的元素
    int get(int[][] matrix, int index) {
        int m = matrix.length, n = matrix[0].length;
        // 计算⼆维中的横纵坐标
        int i = index / n, j = index % n;
        return matrix[i][j];
    }
}
