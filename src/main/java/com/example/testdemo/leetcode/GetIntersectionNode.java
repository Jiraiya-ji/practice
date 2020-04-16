package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class GetIntersectionNode {
    //暴力法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        while (headA!=null){
            ListNode midListNode = headB;
            while (midListNode!=null){
                if(headA==midListNode){
                    return headA;
                }
                midListNode=midListNode.next;
            }
            headA=headA.next;
        }
        return null;
    }
    //哈希方法
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        List<ListNode> listNodeList = new ArrayList<>();
        while (headA!=null){
            listNodeList.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(listNodeList.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
        //双指针方法
}
