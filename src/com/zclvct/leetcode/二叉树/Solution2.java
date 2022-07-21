package com.zclvct.leetcode.二叉树;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 669. 修剪二叉搜索树
 * @date 2022/7/18 20:46
 *
 * 1、是否可以通过遍历一遍二叉树得到答案？如果可以，用一个 traverse 函数配合外部变量来实现，这叫「遍历」的思维模式。
 *
 * 2、是否可以定义一个递归函数，通过子问题（子树）的答案推导出原问题的答案？如果可以，写出这个递归函数的定义，并充分利用这个函数的返回值，这叫「分解问题」的思维模式。
 *
 */
public class Solution2 {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) {
            return null;
        }

        if(root.val <= low) {
            root.left = null;
            root.right = trimBST(root.right , low,high);

        }if( low < root.val && root.val < high) {
            root.left = trimBST(root.left , low,high);
            root.right = trimBST(root.right , low,high);
        }else  if(root.val >= high) {
            root.right = null;
            root.left = trimBST(root.left , low,high);
        }

        return root;
    }
}
