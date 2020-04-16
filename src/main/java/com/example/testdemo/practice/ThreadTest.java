package com.example.testdemo.practice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread  a = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"a");

        Thread  b = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"b");
        a.start();
        b.start();
        b.join();
//        a.join();
    }

}
