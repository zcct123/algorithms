package com.zclvct.leetcode.链表操作的递归;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 206. 反转链表
 * @date 2022/7/17 18:51
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;

    }

}
