package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 142. 环形链表 II
 * @date 2022/7/16 19:58
 */
public class Solution4 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(slow != null && fast !=null) {
            if(slow.next == null || slow.next == null) {
                return null;
            }
            if(fast.next.next == slow.next) {
                slow = slow.next;
                fast = head;

                while (slow != head) {
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }
            slow =slow.next;
            fast = fast.next.next;

        }
        return null;
    }
}
