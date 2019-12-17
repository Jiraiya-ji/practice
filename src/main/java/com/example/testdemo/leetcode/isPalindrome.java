package com.example.testdemo.leetcode;

import com.example.testdemo.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表
 */
public class isPalindrome {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        isPalindrome a = new isPalindrome();
        a.isPalindrome(l1);
        Integer number1 = 1;
        Integer number2 = 2;
        System.out.println(number1.equals(number2));
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
}
