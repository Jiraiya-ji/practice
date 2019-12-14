package com.example.testdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4);
        listNode1.next = listNode2;
        if(listNode1.next!=null){
            System.out.println("=====================");
        }
        p.reverseList(listNode1);
    }
    public ListNode reverseList(ListNode head) {
        //定义之前的节点
        ListNode pre = null;
        //定义当前的节点
        ListNode cur = head;
        while(cur!=null){
            ListNode mid = cur.next;
            cur.next = pre;
            pre = cur;
            cur = mid;
        }
        return pre;
    }
}
