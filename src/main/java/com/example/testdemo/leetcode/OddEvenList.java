package com.example.testdemo.leetcode;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode first = new ListNode(-1);
        ListNode firstHead = first;
        ListNode second =new ListNode(-1);
        ListNode secondHead = second ;
        while (head!=null&&head.next!=null){
            firstHead.next=head;
            firstHead=firstHead.next;
            secondHead.next=head.next;
            secondHead=secondHead.next;
            head=head.next.next;
        }
        if(head!=null){
            firstHead.next=head;
            firstHead=firstHead.next;
        }
        secondHead.next=null;
        firstHead.next=second.next;
        return first.next;
    }
}

