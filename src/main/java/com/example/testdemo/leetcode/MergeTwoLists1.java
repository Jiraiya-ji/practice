package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 反转一个单链表。
 */
public class MergeTwoLists1 {
    public ListNode reverseList(ListNode head) {
        if(head ==null){
            return null;
        }
        List<ListNode> listNodeList = new ArrayList<ListNode>();
        listNodeList.add(head);
        while (head.next!=null){
            head = head.next;
            listNodeList.add(head);
        }
        for (int i = 0; i < listNodeList.size(); i++) {
            if(listNodeList.size()-i-1 == 0){
                listNodeList.get(listNodeList.size()-i-1).next = null;
            }else {
                listNodeList.get(listNodeList.size() - i - 1).next = listNodeList.get(listNodeList.size() - i - 2);
            }
        }
        return listNodeList.get(listNodeList.size()-1);
    }
}
