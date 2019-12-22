package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表
 */
class IsPalindrome {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1;
        ListNode l3 = new ListNode(3);
        l3 = l2;
        l2.val = 2;
        System.out.println(l1.val+"="+l2.val+"="+l3.val);
    }
    public boolean isPalindrome(ListNode head) {
        boolean flag = true;
        List<Integer> list = new ArrayList<Integer>();
        while (head!=null){
            list.add(head.val);
            if(head.next==null){
                break;
            }
            head=head.next;
        }
        for(int i=0;i<list.size()/2;i++){
            if(!list.get(i).equals(list.get(list.size()-1-i))){
                flag = false;
            }
        }
        return flag;
    }
    public boolean isPalindrome1(ListNode head) {
        boolean flag = true;
        //先反转列表，在进行比较
        ListNode cur = head;
        ListNode pre = null;
        //存储原始链表
        ListNode store = head;
        while (cur!=null){
            ListNode mid = new ListNode(-1);
            mid = cur.next;
            pre = cur.next;
            pre = cur;
            cur = mid;
        }
        while (head!=null){
            if(head.val!=pre.val){
                flag = false;
            }
        }
        return flag;
    }
}
