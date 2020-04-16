package com.example.testdemo.leetcode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        //创建新链表，记录 n 的值
        ListNode recordN = head;
        ListNode remove = head;

        for (int i = 0; i < n; i++) {
            recordN = recordN.next;
        }
        if(recordN==null){
            return head=head.next;
        }
        //找到 n 的位置，进行删除
        while (recordN!=null){
            recordN = recordN.next;
            remove=remove.next;
        }
        remove.next = remove.next.next;
        return head;
    }
}
