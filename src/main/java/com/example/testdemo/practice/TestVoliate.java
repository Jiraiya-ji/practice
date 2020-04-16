package com.example.testdemo.practice;


import java.util.concurrent.TimeUnit;

public class TestVoliate {
    private static  boolean flag = false;
    private static int i = 0;
    public static void main(String[] args){
        new Thread(()->{
//            flag = true;

            try {
                TimeUnit.MILLISECONDS.sleep(10);
                flag = true;
//                System.out.println("flag 被修改成 true");
            }catch (InterruptedException e){

            }
        }).start();
        while (!flag){
            i++;
//            System.out.println("flag 标识: "+flag);

        }
//        System.out.println("i 的值是"+i);
    }
}
