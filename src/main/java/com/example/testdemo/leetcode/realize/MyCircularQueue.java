package com.example.testdemo.leetcode.realize;


/**
 * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
 * 将 list 换成数组
 */
public class MyCircularQueue {
    private int capacity;
    private int size;
    private int[] nums;
    //标志位
    private int flag;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        nums = new int[k];
        capacity = k;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        nums[size-capacity] = value;
        capacity--;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        //移动这个 list
        if(capacity ==size-1){
            capacity++;
            return true;
        }
        for (int i = 0; i < size- capacity -1; i++) {
            nums[i] = nums[i+1];
        }
        capacity++;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return nums[0];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return nums[size- capacity-1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(capacity == size){
            return true;
        }
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(capacity == 0 ){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        circularQueue.enQueue(1);  // 返回 true

        circularQueue.enQueue(2);  // 返回 true

        circularQueue.enQueue(3);  // 返回 true

        circularQueue.enQueue(4);  // 返回 false，队列已满

        circularQueue.Rear();  // 返回 3

        System.out.println(circularQueue.Rear());

        circularQueue.isFull();  // 返回 true

        circularQueue.deQueue();  // 返回 true

        circularQueue.enQueue(4);  // 返回 true

        circularQueue.Rear();  // 返回 4
    }

}
