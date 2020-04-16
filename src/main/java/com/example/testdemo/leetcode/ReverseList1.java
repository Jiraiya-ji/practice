package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 写个双指针去实现
 */
public class ReverseList1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> listNodeList = new ArrayList<>();
        listNodeList.add(head);
        while (head.next != null) {
            listNodeList.add(head.next);
            head = head.next;
        }
        if (listNodeList.size() < 2) {
            return null;
        }
        if (listNodeList.size() - n > 0) {
            listNodeList.get(listNodeList.size() - n - 1).next = listNodeList.get(listNodeList.size() - n).next;
            return listNodeList.get(0);
        } else if (listNodeList.size() - n == 0) {
            head.next = null;
            return listNodeList.get(1);
        } else {
            return null;
        }
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode goal = new ListNode(-1);
        goal.next = head;
        ListNode dump1 = goal;
        ListNode dump2 = goal;
        for (int i = 0; i <=n ; i++) {
            dump1 = dump1.next;
        }
        while (dump1!=null){
            dump1 = dump1.next;
            dump2 = dump2.next;
        }
        dump2.next=dump2.next.next;
        return goal.next;
    }
}

