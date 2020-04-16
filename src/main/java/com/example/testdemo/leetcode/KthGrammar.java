package com.example.testdemo.leetcode;

/**
 *
 * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 */
public class KthGrammar {
    public int kthGrammar(int N, int K) {
        //循环停止条件
        if(N==1){
            return 0;
        }
        int value = kthGrammar(N-1,(K+1)/2);
        return value==0?(1- K%2):(K%2);
    }
}
