package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = l2;
        ListNode k = l1;
        //问题如何记这个指针
        while(cur!=null){
            //之前
            if(cur.val<k.val){
                ListNode next = cur.next;
                cur.next = k;
                k=cur;//返回值
                cur = next;
            }//中间
            else if(cur.val>=k.val&&cur.val<k.next.val){
                ListNode next = cur.next;
                ListNode mid = k.next;
                k.next = cur;
                cur.next = mid;
                cur = next;
            }//之后
            else {
                if(k.next==null){
                    k.next = cur;
                }
                k = k.next;
            }
        }
    }
}
