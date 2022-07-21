package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 876. 链表的中间结点
 * @date 2022/7/16 20:08
 */
public class Solution5 {

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null) {
            if(fast.next.next == null) {
                return slow.next;
            }

            fast =fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
