package com.example.testdemo.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable{
    private IntGenerator intGenerator;
    private final int id ;
    public EvenChecker(IntGenerator intGenerator,int id){
        this.intGenerator = intGenerator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!intGenerator.isCanceld()){
            int val = intGenerator.next();
            if(val % 2 !=0){
                System.out.println();
                System.out.println(val+"not even!");
                intGenerator.cancel();
            }
        }
    }
    public static void test(IntGenerator generator,int count){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(generator,i));
        }
        executorService.shutdown();
    }
    public static void main(String[] args){
        IntGenerator intGenerator = new IntGenerator() {
            @Override
            public int next() {
                return 3;
            }
        };
        test(intGenerator,4);
        Integer a = 1;
        a=2;
        a=3;
        if(a==1&&a==2&&a==3){
            System.out.println(1);
        }
    }
}
