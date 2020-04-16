package com.example.testdemo.practice;

public class GenericMethods {
    public <T,D> void  f(T x,D z ){
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args){

    }
}
