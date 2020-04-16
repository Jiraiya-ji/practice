package com.example.testdemo.leetcode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 */
public class RemoveElements {
    //迭代方式
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur!=null){
            //如果需要去除，当前节点向前移动，先前节点不懂
            if(cur.val==val){
                pre.next=cur.next;
                cur=cur.next;
            }else {//不需要去除，两个节点都进行移动
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    //递归方式
    public ListNode removeElements1(ListNode head, int val) {
        return head;
    }
}
