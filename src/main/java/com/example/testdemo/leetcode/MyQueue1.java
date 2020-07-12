package com.example.testdemo.leetcode;

import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 */
public class MyQueue1 {
    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue1() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackOne.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stackTwo.isEmpty()){
            return stackTwo.pop();
        }
        //判断 stackone 是否为空
        //倾倒操作
        while (!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        return stackTwo.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!stackTwo.isEmpty()){
            return stackTwo.pop();
        }
        //判断 stackone 是否为空
        //倾倒操作
        while (!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        return stackTwo.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackOne.isEmpty()?stackTwo.isEmpty():false;
    }
}
