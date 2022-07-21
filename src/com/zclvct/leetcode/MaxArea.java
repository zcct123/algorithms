package com.zclvct.leetcode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 */
public class MaxArea {

    /**
     *  思考：水的容量取决于 短板的高度 和 板的宽度
     *          即使这样也需要 两次遍历计算 水的容量 从左遍历的话有很多重复计算操作
     *  假设：我先假设宽度是最优的
     *       1. 宽度有五个 没有宽度上都存在说水量的最大值
     *       2. 只需要找出 这五个最大值 中 最大的 就是水的容量
     *
     *  尝试 :执行用时：3 ms在所有 Java 提交中击败了  93.72%  的用户
     * 内存消耗：52.1 MB在所有 Java 提交中击败了  12.79%  的用户
     */
    public static int maxArea(int[] height) {
        int area = 0;
        int min = 0;
        int max = height.length - 1;
        while (min != max)
        {
            int temp = (max - min)*(height[min] < height[max]? height[min] : height[max]);
            area = Math.max(temp,area);
            if(height[min] < height[max])
            {
                min ++;
            }else {
                max --;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
        System.out.println(1/5);
    }
}
