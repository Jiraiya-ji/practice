package com.example.testdemo.Java8;

import sun.security.krb5.internal.APOptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Class1_3 {
    public static void main(String[] args) throws IOException {
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2){
                return a1.getWeight().compareTo(a2.getWeight());
            }
        };
        Comparator<Apple> byWeight1 = (Apple o1,Apple o2)->o1.getWeight().compareTo(o2.getWeight());
        new Class1_3().process(()->{System.out.println("3333");});
        String result
                = new Class1_3().processFile((BufferedReader br) -> br.readLine());
        int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);

        List<String> str = Arrays.asList("a","b","A","B");
        str.sort((String s1,String s2)->s1.compareTo(s2));
        str.sort(String::compareToIgnoreCase);

    }
    public void process(Runnable runnable){
        runnable.run();
    }

    public String processFile() throws IOException {
        try(BufferedReader br =
                    new BufferedReader(new FileReader("data.txt"))){
                return br.readLine();
        }
    }
    //函数式接口
    @FunctionalInterface
    public interface BufferedReaderProcessor {
        String process(BufferedReader b) throws IOException;
    }
    //行为参数化
    public String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException{
        try(BufferedReader br =
                    new BufferedReader(new FileReader("data.txt"))){
            return bufferedReaderProcessor.process(br);
        }
    }
    //构造函数引用
    public List<Apple> map(List<Integer> filter, Function<Integer, Apple> f){
        List<Apple> result = new ArrayList<>();
        for(Integer i : filter){
            result.add(f.apply(i));
        }
        return result;
    }
}
