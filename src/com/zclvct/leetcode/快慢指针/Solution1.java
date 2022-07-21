package com.zclvct.leetcode.快慢指针;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 83. 删除排序链表中的重复元素
 * @date 2022/7/16 21:15
 */
public class Solution1 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if(fast.val != slow.val) {
                slow.next = fast;
            }
            fast = fast.next;
        }
        return head;
    }
}
