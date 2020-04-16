package com.example.testdemo.leetcode;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //map 重新排序
        map = sortByValueAscending(map);
        List<Integer> list = new ArrayList<>();
        int goal = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (goal<k){
                goal++;
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueAscending(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<K, V>>(){
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<K,V> result = new LinkedHashMap<>();
        for (Map.Entry<K,V> entry:list){
            result.put(entry.getKey(),entry.getValue());
        }
        return result;
    }
    public static void main(String[] args){
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {4,1,-1,2,-1,2,3};
        System.out.println(topKFrequent.topKFrequent(nums,2));
    }
}
