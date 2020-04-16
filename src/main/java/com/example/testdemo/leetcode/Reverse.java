package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {
    public int reverse(int x) {
        List<Integer> list = new ArrayList<>();
        int flag = 1;
        if(x<0){
            flag = -1;
        }
        while (x/10!=0){
            list.add(x%10);
            x=x/10;
        }
        list.add(x);
        int temp = 0;
        int goal = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=0){
                temp =i;
                break;
            }
        }
        for (int i = temp; i < list.size(); i++) {
              goal = list.get(i)*(int) Math.pow(10,list.size()-1-i)+goal;
        }
        goal = goal*flag;
        if(goal<=Integer.MAX_VALUE||goal>=Integer.MIN_VALUE){
            return goal;
        }
        return 0;
    }
    public int reverse1(int x) {
        int goal = 0;
        while (x!=0){
            int pop = x % 10;
            if(goal>Integer.MAX_VALUE/10||(goal==Integer.MAX_VALUE/10&&pop>7)){
                return 0;
            }
            if(goal<Integer.MIN_VALUE/10||(goal==Integer.MIN_VALUE/10&&pop<-8)){
                return 0;
            }
            goal = goal*10+pop;
            x = x/10;
        }
        return goal;
    }
        public static void main(String[] args){
        String s = "1";
        System.out.println(s.compareTo("2"));
    }
}
