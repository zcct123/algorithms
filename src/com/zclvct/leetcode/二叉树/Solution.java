package com.zclvct.leetcode.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * @date 2022/7/11 21:44
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        zhongxu(list , root);
        return list;
    }

    /**
     * 中序遍历：中序遍历可以记为左根右，也就是说在二叉树的遍历过程中，首先要遍历二叉树的左子树，接着遍历根节点，最后遍历右子树。
     *
     * （1）中序遍历左子树
     *
     * （2）访问根节点
     *
     * （3）中序遍历右子树
     * @param list
     * @param root
     */

    private void zhongxu(List<Integer> list , TreeNode root) {

        if(root == null) {
            return ;
        }
        zhongxu(list,root.left);
        list.add(root.val);
        zhongxu(list,root.right);
    }


    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }

        return  root.left != null ? root.left.val < root.val : true
                &&  root.right != null ? root.right.val > root.val : true
                &&  isValidBST(root.left )
                &&  isValidBST(root.right );

    }
}
