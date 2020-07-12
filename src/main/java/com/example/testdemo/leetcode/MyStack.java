package com.example.testdemo.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用队列实现栈的下列操作：
 *
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 */
public class MyStack {

    Queue<Integer> queueOut = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(queueOut.isEmpty()){
            queueOut.add(x);
        }else {
            Integer[] numbers = new Integer[queueOut.size()];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = queueOut.poll();
            }
            queueOut.add(x);
            for (int i = 0; i < numbers.length; i++) {
                queueOut.add(numbers[i]);
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queueOut.poll();
    }

    /** Get the top element. */
    public int top() {
        return queueOut.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueOut.isEmpty();
    }
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top();
        myStack.pop();
        myStack.empty();
    }
}
