package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

public class MergeTwoLists {
    public static void main(String[] args){
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //假设 l2 只有一个节点
        ListNode k = l1;         //记录指针
        //是否是头节点
        ListNode head = l1;
        ListNode cur = l2;
        while (cur!=null){
            if(cur.val<=head.val){
                cur.next = l1;
                l1 = cur;
            }
            //是中间节点的话
            else if(cur.val>k.val&&cur.val<k.val){
                ListNode mid = k.next;
                k.next = l2;
                l2.next = mid;
            }
            //进行移动，并且判断是否是尾节点
            else {
                //尾结点
                if(k.next.next==null){
                    k.next = cur;
                }
                else{
                    k = k.next;
                }
            }
            cur=cur.next;
        }
        return l1;
    }
}
