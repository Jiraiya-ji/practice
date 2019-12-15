package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

public class ReverseList {
    /**
        说明：反转一个单链表
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode mid = cur.next;
            cur.next = pre;
            pre = cur;
            cur = mid;
        }
        return  pre;
    }
}
