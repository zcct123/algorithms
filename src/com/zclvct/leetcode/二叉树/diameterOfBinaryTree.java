package com.zclvct.leetcode.二叉树;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 543. 二叉树的直径
 * @date 2022/7/18 21:08
 */
public class diameterOfBinaryTree {

    int max = 0;


    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftLenght = getMaxLenght(root.left);
        int rightLenght = getMaxLenght(root.right);

        return Math.max(max , leftLenght + rightLenght );

    }

    private int getMaxLenght(TreeNode left) {
        if(left == null) {
            return 0;
        }
        int leftLenght = getMaxLenght(left.left);
        int rightLenght = getMaxLenght(left.right);
        max =  Math.max(max , leftLenght + rightLenght);
        return Math.max(leftLenght ,rightLenght) + 1;
    }

}
