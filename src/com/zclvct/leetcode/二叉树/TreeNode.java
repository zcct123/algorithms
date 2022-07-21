package com.zclvct.leetcode.二叉树;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2022/7/11 21:44
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
