package com.zclvct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/7/8 22:03
 */
public class Solution8 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();

        ListNode temp = head;
        list.add(temp);

        while(temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        if(n == list.size()) {
            return null;
        }else {
            list.get(n - 1).next = list.get(n);
            return head;
        }

    }

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
