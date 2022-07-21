package com.zclvct.leetcode.二叉树.层序遍历;

import com.zclvct.leetcode.二叉树.TreeNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 226. 翻转二叉树
 * @date 2022/7/18 22:22
 */
public class Solution3 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.right = left;
        root.left = right;

        invertTree(left);
        invertTree(right);

        return root;
    }
}
