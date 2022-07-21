package com.zclvct.leetcode.链表操作的递归;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 25. K 个一组翻转链表
 * @date 2022/7/17 19:55
 */
public class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //剩余数量小于k的话，则不需要反转。
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        // 反转前 k 个元素
        ListNode newHead = reverse(head, tail);
        //下一轮的开始的地方就是tail
        head.next = reverseKGroup(tail, k);

        return newHead;
    }

    /*
    左闭又开区间
     */
    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        ListNode next = null;
        while (head != tail) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode res = reverseList(slow);

        while (head != null && res != null) {
            if(head.val != res.val) {
                return false;
            }
            head = head.next;
            res = res.next;
        }
        return  true;
    }
    ListNode reverseList(ListNode head) {

        if(head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
