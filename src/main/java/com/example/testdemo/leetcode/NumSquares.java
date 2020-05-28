package com.example.testdemo.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 */
public class NumSquares {

    //通过层次遍历 BFS 方法去做
    public int numSquares(int n) {
        Queue<Integer> queueNumber = new LinkedList<>();
        queueNumber.add(n);
        int size = 0;
        Set numberSet = new HashSet();
        while (!queueNumber.isEmpty()){
            size++;
            int length = queueNumber.size();
            //添加节点
            for (int i = 0; i < length; i++) {
                int number = queueNumber.poll();
                int count = 1;
                int result = 1;
                while (count*count<=number){
                    result = count*count;
                    if (number-result==0){
                        return size;
                    }else {
                        if(!numberSet.contains(number-result)){
                            queueNumber.add(number-result);
                        }
                        count++;
                    }
                }
            }

        }
        return size;
    }


    public static void main(String[] args){
        NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(9));
    }
}
