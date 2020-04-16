package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 *
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
 */
public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1==null||list2==null||list1.length<0||list2.length<0){
            return null;
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }
        int sumIndex = list1.length+list2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])){
                if(i+map.get(list2[i])<sumIndex){
                    list.clear();
                    list.add(i);
                    sumIndex = i+map.get(list2[i]);
                }else if(i+map.get(list2[i])==sumIndex){
                    list.add(i);
                }
            }
        }
        String[] goalStr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            goalStr[i]=list2[list.get(i)];
        }
        return goalStr;
    }
}
