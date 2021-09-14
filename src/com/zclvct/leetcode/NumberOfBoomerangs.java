package com.zclvct.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 *
 * 给定平面上 n 对 互不相同 的点 points ，
 * 其中 points[i] = [xi, yi] 。
 * 回旋镖 是由点 (i, j, k) 表示的元组 ，
 * 其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 *
 * 返回平面上所有回旋镖的数量。
 
 * @date 2021/9/13 9:26
 */
public class NumberOfBoomerangs {

    public static int numberOfBoomerangs(int[][] points) {
        Map<String,Map<Integer,Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int xPointX = points[i][0];
            int xPointY = points[i][1];
            Map<Integer,Integer> count = new HashMap<>();
            for (int j = 0; j < points.length ; j++) {
                int yPointX = points[j][0];
                int yPointY = points[j][1];
                int sum = (int) Math.pow(yPointX - xPointX,2) + (int)Math.pow(yPointY - xPointY,2);
                if(count.containsKey(sum))
                {
                    count.put(sum,count.get(sum)+1);
                }else {
                    count.put(sum,1);
                }
            }
            hashMap.put( xPointX+","+ xPointY,count);
        }
        AtomicInteger i = new AtomicInteger();
        hashMap.forEach((string , map) -> {
                map.forEach((sum , count) -> {
                    if(count > 1)
                    {
                        i.addAndGet((count - 1) * count);
                    }
                });
        });
        return i.get();
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{0,0},{1,0},{2,0}};
        System.out.println(numberOfBoomerangs(points));
    }
}
