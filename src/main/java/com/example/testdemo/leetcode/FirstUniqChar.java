package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        if(s.equals("")){
            return -1;
        }
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(hashMap.containsKey(chars[i])){
                hashMap.put(chars[i],hashMap.getOrDefault(chars[i],0)-1);
            }else {
                hashMap.put(chars[i],hashMap.getOrDefault(chars[i],0));
            }
        }
        for (int i = 0; i <chars.length ; i++) {
            if(hashMap.get(chars[i])==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String s = "loveleetcode";
        firstUniqChar(s);
    }
}
