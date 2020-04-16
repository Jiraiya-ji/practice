package com.example.testdemo.Thread;

public class ThreadSynchronized {
    static int i = 0;
    public   void increase(){
        synchronized (this){
            i++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadSynchronized threadSynchronized = new ThreadSynchronized();
        Thread a = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                threadSynchronized.increase();
            }
        });

        Thread b= new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                threadSynchronized.increase();
            }
        });
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(threadSynchronized.i);
    }
}
