package com.example.testdemo.leetcode;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }
        if(strs.length==1){
            return Arrays.toString(strs);
        }
        int middle = -1;
        boolean flag = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].length() -1<i){
                    flag = true;
                    break;
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    flag = true;
                    break;
                }
                if(j==strs.length-1){
                    middle++;
                }
            }
            if(flag){
                break;
            }
        }
        if(middle!=-1){
            return strs[0].substring(0,middle);
        }
        return "";
    }
    public static void main(String[] args){
        String s = "hello";
        s.toString();
        System.out.println(s.substring(0,s.length()));
    }
}
