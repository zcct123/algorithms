package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;
import com.zclvct.TreeNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 109. 有序链表转换二叉搜索树
 * @date 2022/7/16 20:37
 */
public class Solution7 {

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode treeNode = null;

        if(head == null) {
            return null;
        }
        if(head.next ==null) {
            return new TreeNode(head.val);
        }
        ListNode fast = head;
        ListNode slow = head;

        while (true) {
            if(fast.next == null) {
                treeNode = new TreeNode(slow.next.val , sortedListToBST(head),sortedListToBST(slow.next));
                return treeNode;
            }else if(fast.next.next == null) {
                treeNode = new TreeNode(slow.next.val , sortedListToBST(head),sortedListToBST(slow.next));
                return treeNode;
            }else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }

    }
}
