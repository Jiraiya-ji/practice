package com.example.testdemo.leetcode;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length ; i++) {
            int goal = target-numbers[index1];
            for (int j = i+1; j < numbers.length; j++) {
                if(goal==numbers[j]){
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        return new int[]{index1+1,index2+1};
    }
    public static void main(String[] args){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 ; j++) {
               if(j==0){
                   break;
               }
            }
            System.out.println(i);
        }
    }
}
