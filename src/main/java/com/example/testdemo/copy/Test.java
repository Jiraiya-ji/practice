package com.example.testdemo.copy;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        int i =3;
        int m = i;
        System.out.println(i+"  "+m);
        m = 4;
        System.out.println(i+"  "+m);
    }
}
