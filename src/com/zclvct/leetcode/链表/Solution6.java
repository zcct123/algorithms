package com.zclvct.leetcode.链表;

import com.zclvct.ListNode;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 160. 相交链表
 * @date 2022/7/16 20:12
 */
public class Solution6 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;

        int count = 1;

        while (true) {
            if(node1 == node2) {
                return node1;
            }

            if(node1 == null) {
                if(count > 1) {
                    return null;
                }else {
                    node1 = headB;
                }
                count ++;
            }

            if(node2 == null) {
                if(count > 1) {
                    return null;
                }else {
                    node2 = headA;
                }
            }

        }
    }
}
