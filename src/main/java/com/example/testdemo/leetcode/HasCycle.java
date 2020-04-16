package com.example.testdemo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
 */
public class HasCycle {
    //利用 set
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> setListNode = new HashSet<ListNode>();
        while (head != null) {
            if (setListNode.contains(head)) {
                return true;
            }
            setListNode.add(head);
            head = head.next;
        }
        return false;
    }
    //快慢指针
    public boolean hasCycle1(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode slowListNode = head;
        ListNode fastListNode = head;
        while (slowListNode!=fastListNode){
            if(fastListNode==null||fastListNode.next==null){
                return false;
            }
            slowListNode = slowListNode.next;
            fastListNode = fastListNode.next.next;
        }
        return true;
    }
}
