package com.zclvct.leetcode.链表操作的递归;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 92. 反转链表 II
 * @date 2022/7/17 19:10
 */
public class Solution1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseTopN(head, n);
        }

        ListNode between = reverseBetween(head.next, m-1,n-1);
        head.next = between;
        return head;
    }

    ListNode topNSuccessor = null;

    private ListNode reverseTopN(ListNode head, int n) {
        if (n == 1) {
            topNSuccessor = head.next;
            return head;
        }
        ListNode newHead = reverseTopN(head.next, n-1);
        head.next.next = head;
        head.next = topNSuccessor;
        return newHead;
    }
}
