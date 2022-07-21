package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 19. 删除链表的倒数第 N 个结点
 * @date 2022/7/14 20:53
 */
public class Solution1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p1 = head;
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}

