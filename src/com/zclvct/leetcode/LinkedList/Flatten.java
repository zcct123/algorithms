package com.zclvct.leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochong
 * @version 1.0
 * @description:
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。
 * 这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 *
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 *
 *
 * 链接：https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list
 *
 * @date 2021/9/24 8:32
 */
public class Flatten {
    public static Node flatten(Node head) {
        Node node1 = head;
        if(node1 == null)
        {
            return head;
        }
      //  Node temp = null;
        List<Node> nodeList = new ArrayList<>();
        while (node1 != null)
        {
            if(node1.child == null )
            {
                if(node1.next != null)
                {
                    node1 = node1.next;
                }else {
                    // 遍历缓存
                    for (int i = nodeList.size()-1; i >= 0; i--) {
                        node1.next = nodeList.get(i);
                        node1.next.prev = node1;
                        while (node1.next != null)
                        {
                            node1 = node1.next;
                        }
                    }
                    return head;
                }

            }else
            {
                if(node1.next != null)
                {
                    nodeList.add(node1.next);
                }
                node1.next = node1.child;
                node1.child.prev = node1;
                node1.child = null;
                node1 = node1.next;

            }
        }
        return head;
    }

    public static void main(String[] args) {

    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    ;

}
