package com.example.testdemo.Java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class Class1_3 {
    public static void main(String[] args){
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2){
                return a1.getWeight().compareTo(a2.getWeight());
            }
        };
        Comparator<Apple> byWeight1 = (Apple o1,Apple o2)->o1.getWeight().compareTo(o2.getWeight());
        new Class1_3().process(()->{System.out.println("3333");});
    }
    public void process(Runnable runnable){
        runnable.run();
    }
//    public String processFile() throws IOException {
//        try {
//            BufferedReader bufferedReader =
//                    new BufferedReader(new FileReader("data.txt"))；
//        }
//    }
}
