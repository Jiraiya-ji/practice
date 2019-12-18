package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

public class MergeTwoLists {
    public static void main(String[] args){
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode store = null;
        while (l1.next!=null&&l2.next!=null){
            if (l1.val>l2.val){
                store.next = l2;
                l2 = l2.next;
            }else {
                store.next =l1;
                l1 = l1.next;
            }
        }
        store.next = l1==null?l2:l1;
        return store;
    }
}
