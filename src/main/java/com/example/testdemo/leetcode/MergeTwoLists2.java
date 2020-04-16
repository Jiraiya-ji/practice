package com.example.testdemo.leetcode;


/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode dump = new ListNode(-1);
        // dump 的 next 指向两个链表的较小者，依次递归
        if(l1.val>=l2.val){
            dump.next = l1;
            dump.next.next = mergeTwoLists(l1.next,l2);
        }else {
            dump.next = l2;
            dump.next.next = mergeTwoLists(l1.next,l2);
        }
        return dump.next;
    }
    //用迭代法去合并两个有序链表
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode goalListNode = new ListNode(-1);
        ListNode entitlListNode = goalListNode;
        //循环部分
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                entitlListNode.next = l1;
                l1=l1.next;
            }else {
                entitlListNode.next = l2;
                l2=l2.next;
            }
            entitlListNode = entitlListNode.next;
        }
        entitlListNode.next = l1==null?l2:l1;
        return goalListNode.next;
    }
    public static void main(String[] args){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3= new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        MergeTwoLists2 mergeTwoLists2 = new MergeTwoLists2();
        mergeTwoLists2.mergeTwoLists1(listNode1,listNode4);
    }
}
