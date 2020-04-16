package com.example.testdemo.leetcode;

/**
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
class MyLinkedList {
    private ListNode listNode;
    private int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        listNode=null;
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=0&&index<=size){
            return index;
        }else {
            return -1;
        }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(listNode==null){
            listNode = new ListNode(val);
            size++;
            return;
        }
        //index < 0
        if(index <=0){
            ListNode head = new ListNode(val);
            head.next = listNode;
            size++;
            listNode = head;
        }else if(index>=size){
            ListNode cycle = listNode;
            while (cycle.next!=null){
                cycle=cycle.next;
            }
            size++;
            cycle.next = new ListNode(val);
        }else {
            ListNode cycle = listNode;
            for (int i = 0; i < index-1; i++) {
                cycle=cycle.next;
            }
            ListNode mid = cycle.next;
            ListNode newListNode = new ListNode(val);
            cycle.next=newListNode;
            newListNode.next=mid;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(listNode!=null&&index>=0&&index<=size){
            size--;
            if(index==0){
                listNode=listNode.next;
            }else {
                ListNode cycle = listNode;
                for (int i = 0; i < index-1; i++) {
                    cycle=cycle.next;
                }
                cycle.next=cycle.next.next;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */