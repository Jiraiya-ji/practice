package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        return swap(hashMap,n);
    }
    //优化版本
    public int swap(Map<Integer,Integer> map,int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int goal = swap(map,n-1)+swap(map,n-2);
        map.put(n,goal);
        return goal;
    }
}
