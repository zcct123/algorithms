package com.zclvct.leetcode.二叉搜索树;

import com.zclvct.TreeNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 538. 把二叉搜索树转换为累加树
 * @date 2022/7/19 20:53
 */
public class Solution {

    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    // 记录累加和
    int sum = 0;
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        // 维护累加和
        sum += root.val;
        // 将 BST 转化成累加树
        root.val = sum;
        traverse(root.left);
    }



}
