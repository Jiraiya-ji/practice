package com.example.testdemo.leetcode;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.equals("")){
            return 0;
        }
        Map<Character,Integer> hashMap = new HashMap<>();
        int length = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            //如何正确的回到之前
           if(hashMap.containsKey(s.charAt(i))&&hashMap.get(s.charAt(i))>=index){
               index=hashMap.get(s.charAt(i))+1;
               hashMap.put(s.charAt(i),i);
           }else {
               if(i-index>length){
                   length=i-index;
               }
               hashMap.put(s.charAt(i),i);
           }
        }
        return length+1;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        new lengthOfLongestSubstring().lengthOfLongestSubstring(s);
    }
}
