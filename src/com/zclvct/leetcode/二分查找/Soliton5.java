package com.zclvct.leetcode.二分查找;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 标签：⼀维动态规划，⼆分搜索，动态规划
 * @date 2022/7/14 19:53
 */
public class Soliton5 {

    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        // 按宽度升序排列，如果宽度一样，则按高度降序排列
        Arrays.sort(envelopes, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });
        return  1;
    }

}
