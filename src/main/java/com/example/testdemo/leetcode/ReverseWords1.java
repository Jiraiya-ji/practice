package com.example.testdemo.leetcode;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 */
public class ReverseWords1 {
    public String reverseWords(String s) {
        if(s==null){
            return s;
        }
        String trimString = s.trim();
        if(s.equals("")){
            return trimString;
        }
        int begin = s.length()-1;
        int end = s.length()-1;
        int pre = s.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=s.length()-1; i >=0 ; i--) {
            //记录字符
            if(s.charAt(i)!=' '){
                if(s.charAt(pre)==' '){
                    stringBuilder.append(" ");
                    begin = i;
                    end = i;
                }else {
                    begin =i;
                }
            }
            //记录空字符
            else {
                if(s.charAt(pre)!=' '){
                    stringBuilder.append(s.substring(begin,end+1));
                    begin = i;
                    end = i;
                }else {
                    begin = i;
                    end = i;
                }
            }
            //处理最后一个字符串
            if(i==0){
                stringBuilder.append(s.substring(0,end+1));
            }
            pre = i;
        }
        return stringBuilder.toString();
    }
}
