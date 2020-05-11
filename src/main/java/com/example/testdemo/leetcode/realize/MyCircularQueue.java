package com.example.testdemo.leetcode.realize;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 */
public class MyCircularQueue {
    private List<Integer> list;
    private int size ;
    //标志位
    private int flag;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        list = new ArrayList(k);
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        list.set(list.size()-size,value);
        size--;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        //移动这个 list
        if(size==5){
            size++;
            return true;
        }
        for (int i = 0; i < list.size()-size-1; i++) {
            list.set(i,list.get(i+1));
        }
        size++;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return list.get(0);
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-size);
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(size<=0){
            return false;
        }
        return true;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(size>0){
            return false;
        }
        return true;
    }
}
