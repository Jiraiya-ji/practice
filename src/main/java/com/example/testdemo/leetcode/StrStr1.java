package com.example.testdemo.leetcode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class StrStr1 {
    public static int strStr(String haystack, String needle) {
        //如果 needle 为空，返回 0
        if(needle.equals("")){
            return 0;
        }
        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i]==chars2[0]&&(i+chars2.length-1)<chars1.length){
                for (int j = 1;j < chars2.length; j++) {
                    if(chars2[j]!=chars1[i+j]){
                        break;
                    }
                    if(j==chars1.length-1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str1 = "mississippi";
        String str2 = "sipp";
        strStr(str1,str2);
    }
}
