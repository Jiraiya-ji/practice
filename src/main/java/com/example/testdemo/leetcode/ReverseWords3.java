package com.example.testdemo.leetcode;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class ReverseWords3 {
    //脑子秀逗了
    public String reverseWords(String s) {
        if(s==null||s.equals(" ")) return s;
        char[] strChars = s.toCharArray();
        int left = 0;
        int right = 0;
        for (; left< strChars.length; left++) {
            if(strChars[left]!=' '){
                for (;left<strChars.length;left++){
                    if(strChars[left]!=' '){
                        right=left;
                    }else {
                        left--;
                        break;
                    }
                }
            }
        }
        return "s";
    }
    public String reverseWords1(String s){
        String[] strs = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: strs){
            str = new StringBuffer(str).reverse().toString();
            stringBuilder.append(str+" ");
        }
        return stringBuilder.toString().trim();
    }
}
