package com.example.testdemo.practice;

import java.util.ArrayList;
import java.util.List;

public class InitClass {
    public String toString(){
        return "this"+super.toString()+"~~~";
    }
    public static void main(String[] args){
        List<InitClass> list = new ArrayList<InitClass>();
        for (int i = 0; i < 5; i++) {
            list.add(new InitClass());
        }
        System.out.println(list);
    }
}
