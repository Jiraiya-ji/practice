package com.example.testdemo.copy;

import com.example.testdemo.ListNode;
import com.example.testdemo.leetcode.Intersect1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    private List<Integer> list = new ArrayList<>();
    public void putList(){
        list.add(1);
    }
    public static void main(String[] args){
        TestArrayList testArrayList = new TestArrayList();
        TestArrayList testArrayList1 = new TestArrayList();
        testArrayList.compareObject(testArrayList);
    }
    public boolean compareObject(Object o){
        boolean flag = false ;
        String d = "\\";
        if(this == o){
            flag = !flag;
            System.out.println(flag);
        }
        return flag;


    }
}
