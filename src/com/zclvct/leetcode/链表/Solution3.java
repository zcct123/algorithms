package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 141. 环形链表 快慢指针
 * @date 2022/7/16 19:54
 */
public class Solution3 {

    public boolean hasCycle(ListNode head) {

        ListNode tow = head;
        ListNode one = head;

        while(tow != null && one !=null) {
            if(tow.next == null || one.next == null) {
                return false;
            }
            if(tow.next.next == one.next) {
                return true;
            }
            one =one.next;
            tow = tow.next.next;

        }
        return false;
    }

}
