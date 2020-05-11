package com.example.testdemo.leetcode;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if(s==null||s.equals(" ")){
            return s;
        }
        String[] strs = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--) {
            if(strs[i].equals(" ")) continue;
            stringBuilder.append(strs[i]+" ");
        }
        return stringBuilder.toString().trim();
    }
    //方法二 通过双指针实现
}
