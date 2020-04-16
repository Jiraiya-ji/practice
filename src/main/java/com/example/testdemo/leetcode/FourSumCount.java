package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 *
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 */
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A.length<0){
            return 0;
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int dump = A[i]+B[j];
                countMap.put(dump,countMap.getOrDefault(dump,0)+1);
            }
        }
        //这个方法是存 map 的
        int count = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int dump = 0-(C[i]+D[j]);
                if (countMap.containsKey(dump)){
                    count=count+countMap.get(dump);
                }
            }
        }
        return count;
    }

}
