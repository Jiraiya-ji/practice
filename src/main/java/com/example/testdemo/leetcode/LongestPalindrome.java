package com.example.testdemo.leetcode;


/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length<2){
            return s;
        }
        boolean[][] arr = new boolean[length][length];
        char[] chars = s.toCharArray();
        int maxLength = 0;
        String result = s.substring(0,1);
        for (int i = 0; i < length; i++) {
            arr[i][i] = true;
        }
        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                if(chars[i]!=chars[j]){
                    arr[i][j] = false;
                }else {
                   if(j - i<3){
                       arr[i][j] = true;
                   }else {
                       arr[i][j] = arr[i+1][j-1];
                   }
                }
                //判断是否是最长
                if(arr[i][j]&&j-i+1>=maxLength){
                    maxLength = j-i+1;
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestPalindrome l =new LongestPalindrome();
        l.longestPalindrome("ac");
    }
}
