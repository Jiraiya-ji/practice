package com.example.testdemo.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 */
public class Merge1 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2){
            return intervals;
        }
        // 先按照区间起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] curNumbers = intervals[i];
            int[] peek = list.get(list.size()-1);
            if(curNumbers[0]>peek[1]){
                list.add(curNumbers);
            }else {
                peek[1] = Math.max(curNumbers[1],peek[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
