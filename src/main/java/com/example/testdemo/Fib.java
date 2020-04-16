package com.example.testdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 */
public class Fib {
    public int fib(int N) {
       HashMap<Integer,Integer>  hashMap = new HashMap<>();
       return swap(hashMap,N);
    }
    public int swap(Map<Integer,Integer> map,int N){
        int goal =0;
        //基线条件
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        if(map.containsKey(N)) {
            return map.get(N);
        }
        goal = swap(map,N-1)+swap(map,N-2);
        map.put(N,goal);
        return goal;
    }
}
