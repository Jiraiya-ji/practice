package com.example.testdemo.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        if(J==null||S==null){
            return 0;
        }
        Character c ='e';
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i),0);
        }
        for (int i = 0; i < S.length(); i++) {
            if(map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
            }
        }
        int sum =0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            sum=sum+entry.getValue();
        }
        return sum;
    }
}
