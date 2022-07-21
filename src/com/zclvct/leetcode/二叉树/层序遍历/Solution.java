package com.zclvct.leetcode.二叉树.层序遍历;

import com.zclvct.leetcode.二叉树.TreeNode;

import java.util.*;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 515. 在每个树行中找最大值
 * @date 2022/7/18 21:47
 */
public class Solution {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        while (!d.isEmpty()) {
            int sz = d.size(), max = d.peek().val;
            while (sz-- > 0) {
                TreeNode node = d.pollFirst();
                max = Math.max(max, node.val);
                if (node.left != null) d.addLast(node.left);
                if (node.right != null) d.addLast(node.right);
            }
            ans.add(max);
        }
        return ans;
    }
}
