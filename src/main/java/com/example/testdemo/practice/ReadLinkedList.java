package com.example.testdemo.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ReadLinkedList {
    public static void main(String[] args){
        Queue queue = new LinkedList();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
