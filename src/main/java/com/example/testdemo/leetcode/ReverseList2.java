package com.example.testdemo.leetcode;

/**
 *     你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseList2 {
    //迭代法
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        head.next = null;
        while (cur!=null){
            ListNode midListNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = midListNode;
        }
        return pre;
    }
    //递归法
    public ListNode reverseList1(ListNode head) {
        //停止的基线条件
        if(head.next==null){
            return null;
        }
        //递归循环部分
        ListNode pre = head;
        ListNode cur = head.next;
        cur.next = pre;
        pre.next = reverseList1(cur);
        return cur;
    }
}
