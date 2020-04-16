package com.example.testdemo.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode dump = new ListNode(0);
        ListNode cur = dump;
        int carry = 0;
        while (first!=null||second!=null){
          int number = (first==null?0:first.val)+(second==null?0:second.val)+ carry;
          carry = number/10;
          cur.next=new ListNode(number%10);
          cur=cur.next;
          if(first!=null){
              first=first.next;
          }
          if(second!=null){
              second=second.next;
          }
        }
        if(carry==1){
            cur.next = new ListNode(1);
        }
        return dump.next;
    }
    //反转链表
    public ListNode reverse(ListNode listNode){
        if(listNode==null||listNode.next==null){
            return listNode;
        }
        ListNode pre = listNode;
        ListNode cur = listNode.next;
        pre.next=null;
        while (cur.next!=null){
            ListNode mid = cur.next;
            cur.next=pre;
            pre=cur;
            cur=mid;
        }
        cur.next = pre;
        return cur;
    }
}
