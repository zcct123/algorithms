package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 86. 分隔链表
 * @date 2022/7/14 20:32
 */
public class Solution {

    public ListNode partition(ListNode head, int x) {
        ListNode low = null;
        ListNode height = null;

        ListNode lowH = null;
        ListNode heightH= null;
        if(head != null) {
            if(head.val < x) {
                if(low == null) {
                    low = head;
                    lowH = head;
                }else {
                    low.next = head;
                }
            }else {
                if(height == null) {
                    height = head;
                    heightH = head;
                }else {
                    height.next = head;
                }
            }
            head = head.next;
        }

        if(low != null) {
            low.next = heightH;
            return lowH;
        }else {
            return heightH;
        }
    }
}
