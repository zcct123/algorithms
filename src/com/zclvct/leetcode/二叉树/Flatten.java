package com.zclvct.leetcode.二叉树;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 114. 二叉树展开为链表
 * @date 2022/7/18 22:06
 */
public class Flatten {
    TreeNode head = new TreeNode(0);
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        head.right = root;
        head = root;

        traverse(left);
        traverse(right);

    }

    public TreeNode traverse(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        head.right = root;
        head = root;

        TreeNode traverse = traverse(left);
        TreeNode traverse1 = traverse(right);

        return head;
    }

}
