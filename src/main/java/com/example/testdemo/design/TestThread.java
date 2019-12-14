package com.example.testdemo.design;

public class TestThread implements Runnable {
    private int i =0;
    @Override
    public void run() {
        while(i<10){
            i++;
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TestThread testThread = new TestThread();
        Thread t1 = new Thread(testThread,"t1");
        Thread t2 = new Thread(testThread,"t2");
        t1.start();
        t2.start();
    }
}
