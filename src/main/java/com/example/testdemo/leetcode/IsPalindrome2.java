package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 */
public class IsPalindrome2 {
    //可以循环到一半
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        ListNode reverseListNode = head;
        while (reverseListNode!=null){
            list.add(reverseListNode.val);
            reverseListNode=reverseListNode.next;
        }
        Collections.reverse(list);
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
