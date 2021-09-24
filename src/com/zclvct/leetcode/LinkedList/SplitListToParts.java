package com.zclvct.leetcode.LinkedList;

/**
 * @author zhaochong
 * @version 1.0
 * @description: 给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。
 * <p>
 * 每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。
 * <p>
 * 这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。
 * <p>
 * 返回一个符合上述规则的链表的列表。
 * <p>
 * 举例： 1->2->3->4, k = 5 // 5 结果 [ [1], [2], [3], [4], null ]
 * <p>
 * 示例 1：
 * <p>
 * 输入:
 * root = [1, 2, 3], k = 5
 * 输出: [[1],[2],[3],[],[]]
 * 解释:
 * 输入输出各部分都应该是链表，而不是数组。
 * 例如, 输入的结点 root 的 val= 1, root.next.val = 2, \root.next.next.val = 3, 且 root.next.next.next = null。
 * 第一个输出 output[0] 是 output[0].val = 1, output[0].next = null。
 * 最后一个元素 output[4] 为 null, 它代表了最后一个部分为空链表。
 * 示例 2：
 * <p>
 * 输入:
 * root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
 * 输出: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
 * 解释:
 * 输入被分成了几个连续的部分，并且每部分的长度相差不超过1.前面部分的长度大于等于后面部分的长度。
 * <p>
 * <p>
 * 提示:
 * <p>
 * root 的长度范围： [0, 1000].
 * 输入的每个节点的大小范围：[0, 999].
 * k 的取值范围： [1, 50].
 * <p>
 * <p>
 *
 * 链接：https://leetcode-cn.com/problems/split-linked-list-in-parts
 *
 * @date 2021/9/22 8:55
 */
public class SplitListToParts {

    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]  resList = new ListNode[k];
        int lenght = 0;
        ListNode low = head;
        while (low != null)
        {
            lenght ++;
            low = low.next;
        }
        low = head;
        int lSzie = lenght / k;
        int offset = lenght % k;
        for (int i = 0; i < k; i++) {
            if(lSzie == 0 && offset == 0)
            {
                resList[i] = null;
                continue;
            }
            resList[i] = low;
            for (int j = 0; j < lSzie+(offset>0? 1:0)-1; j++) {
               low = low.next;
            }
            ListNode temp = low.next;
            low.next = null;
            low = temp;
//            if(lSzie > 0)
//            {
//                lSzie --;
//            }
            if(offset > 0)
            {
                offset --;
            }

        }
        return resList;
    }

    public static void main(String[] args) {
        ListNode listNode =  new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);
        ListNode listNode7 = new ListNode(8);
        ListNode listNode8 = new ListNode(9);
        ListNode listNode9 = new ListNode(10);


        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode8;
//        listNode8.next = listNode9;
        System.out.println(splitListToParts(listNode,3));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
