package com.example.testdemo.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身
 *
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||t==null){
            return false;
        }
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hashMap = new HashMap<>();
        char[] strChars1 = s.toCharArray();
        char[] strChars2 = t.toCharArray();
        for (int i = 0; i < strChars1.length ; i++) {
            if(hashMap.containsKey(strChars1[i])){
                if(hashMap.get(strChars1[i])!=strChars2[i]){
                    return false;
                }
            }else {
                if(hashMap.containsValue(strChars2[i])){
                    return false;
                }else {
                    hashMap.put(strChars1[i],strChars2[i]);
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "ab";
        String t = "aa";
        new IsIsomorphic().isIsomorphic(s,t);
    }
}
