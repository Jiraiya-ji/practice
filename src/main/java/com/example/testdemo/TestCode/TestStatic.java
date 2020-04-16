package com.example.testdemo.TestCode;

public class TestStatic {
    public static String Tree = "杨树";
    public static void modfiyTreeName(){
        System.out.println(Tree);
    }
    public static void getStr(String...args){
        for (String str:args) {
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        TestStatic.modfiyTreeName();
        TestStatic.Tree = "枫树";
        TestStatic.modfiyTreeName();
        TestStatic.getStr();
    }
}
