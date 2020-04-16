package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 */
public class Generate1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                list.add(swap(i,j));
            }
            lists.add(list);
        }
        return lists;
    }
    public int swap(int i,int j){
        //返回的基本条件
        if(j==0||i==j){
            return 1;
        }
        //递归查找
        return swap(i-1,j-1)+swap(i-1,j);
    }
}
