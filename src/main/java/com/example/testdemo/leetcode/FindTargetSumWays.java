package com.example.testdemo.leetcode;


import java.util.*;
import java.util.stream.Collectors;

/**
 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
 *
 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
 *
 * 提示
 * 数组非空，且长度不会超过 20 。
 * 初始的数组的和不会超过 1000 。
 * 保证返回的最终结果能被 32 位整数存下
 */
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length<=0){
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(nums[0]);
        queue.add(nums[0]*-1);
        for (int i = 1; i < nums.length; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int cur = queue.poll();
                queue.add(nums[i]+cur);
                queue.add(nums[i]*-1+cur);
            }
        }
        List list =  queue.stream().filter(x->x==S).collect(Collectors.toList());
        return list.size();
    }
    //递归解法
    public int findTargetSumWays1(int[] nums, int S) {
        return helper(nums, 0, 0, S);
    }

    private int helper(int[] nums, int i, int sum,int S){
        if(i == nums.length){
            return sum == S ? 1 : 0;
        }
        //　两种选择，一种是  +nums[i], 一种是  -nums[i]
        int c1= helper(nums, i+1, sum+nums[i], S);
        int c2 = helper(nums, i+1, sum-nums[i], S);
        return c1 + c2;
    }
    public static void main(String[] args){
        for (int i = 0; i < -1; i++) {
            System.out.println(1);
        }
        new C().hello();

    }
}
interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}
interface B extends A {
    default void hello() {
        System.out.println("Hello from B");
    }
}
class C implements B, A {

}