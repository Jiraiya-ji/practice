package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preIntegerList = new ArrayList<>();
        List<Integer> curIntegerList = new ArrayList<>();
        preIntegerList.add(1);
        // 如何生成第二列
        for (int j = 1; j <=rowIndex ; j++) {
            for (int i = 0; i < rowIndex+1; i++) {
                curIntegerList.add(getSum(preIntegerList,i));
            }

            preIntegerList = curIntegerList;
            curIntegerList.clear();
        }
        return preIntegerList;
    }
    //参数：pre 当前
    public Integer getSum(List<Integer> list,int number){
        int firstNumber = 1;
        int secondNumber = 1;
        if (number-1<0||number-1>=list.size()){
           firstNumber = 0;
        }else {
            firstNumber = list.get(number-1);
        }
        if (number<0||number>=list.size()){
            secondNumber = 0;
        }else {
            secondNumber = list.get(number);
        }
        return firstNumber+secondNumber;
    }
    public static void main(String[] args){
        GetRow getRow = new GetRow();
        System.out.println(getRow.getRow(1));
    }
}
