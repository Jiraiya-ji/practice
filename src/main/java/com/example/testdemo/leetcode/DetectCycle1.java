package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
 *
 */
public class DetectCycle1 {
    //迭代法
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        Map<ListNode,Integer> listNodeMap = new HashMap<>();
        int count = 0;
        while (head!=null){
            if(listNodeMap.containsKey(head)){
                return head;
            }else {
                listNodeMap.put(head,count++);
                head = head.next;
            }
        }
        return null;
    }
    //双指针解法
    public ListNode detectCycle1(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slowListNode = head;
        ListNode fastListNode = head.next;
        while (true){
            if(fastListNode==null||fastListNode.next==null){
                return null;
            }
            slowListNode=slowListNode.next;
            fastListNode=fastListNode.next.next;
            if(slowListNode==fastListNode){
                break;
            }
        }
        fastListNode=head;
        //此时为数学问题
        while (fastListNode!=slowListNode){
            fastListNode=fastListNode.next;
            slowListNode=slowListNode;
        }
        return slowListNode;
    }

        public static void main(String[] args){
        Map<Integer, Integer> IntegerMap = new HashMap<>();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        IntegerMap.put(c,1);
        c=b;
        IntegerMap.put(c,2);
        c=a;
        IntegerMap.put(c,3);
        System.out.println(IntegerMap.size());
        System.out.println(IntegerMap.get(b));

    }
}
