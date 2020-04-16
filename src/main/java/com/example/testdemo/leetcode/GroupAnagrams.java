package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null){
            return null;
        }
        if(strs.length<1){
            return new ArrayList<>();
        }
        //1.hashmap 存放组，和组标志，方法如和阻力相同，则放到这个这个组里
        //问题，如何判断两个是字母异位词呢，一个是相等，割分，排序，判断是否相等
        List<List<String>> lists = new ArrayList<>();
        HashMap<String,List> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String chars = getChars(strs[i]);
            if(map.containsKey(chars)){
                map.get(chars).add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(chars,list);
            }
        }
        for (String e: map.keySet()){
            lists.add(map.get(e));
        }
        return lists;
    }
    public String getChars(String str){
        if(str==null){
            return null;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
    public static void main(String[] args){
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        System.out.println(groupAnagrams.getChars("eat"));
        System.out.println(groupAnagrams.getChars("tea"));

    }
}
