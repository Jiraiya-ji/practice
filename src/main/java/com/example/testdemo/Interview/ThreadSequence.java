package com.example.testdemo.Interview;



public class ThreadSequence {
    public static void main(String[] args) throws InterruptedException {
        Thread b = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程运行");
        },"b");

        Thread c = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程运行");
        },"c");

        Thread d = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程运行");
        },"d");

        Thread e = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程运行");
        },"e");

        Thread a = new Thread(()->{
            try {
                b.join();
                c.join();
                d.join();
                e.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程运行");
        },"a");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
