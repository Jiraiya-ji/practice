package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //假设 l2 只有一个节点
        ListNode k = l1;         //记录指针
        //是否是头节点
        ListNode head = l1;
        if(l2.val<=head.val){
            l2.next = l1;
            l1 = l2;
        }
        //是中间节点的话
        else if(l2.val>k.val&&l2.val<k.val){
            ListNode mid = k.next;
            k.next = l2;
            l2.next = mid;
        }
        //进行移动，并且判断是否是尾节点
        else {
            //尾结点
            if(k.next.next==null){
                k.next = l2;
            }
            else{
               k = k.next;
            }
        }
        return l1;
    }
}
