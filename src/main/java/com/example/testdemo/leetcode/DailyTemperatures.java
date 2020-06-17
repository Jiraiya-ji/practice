package com.example.testdemo.leetcode;


import java.util.Stack;

/**
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 */
public class DailyTemperatures {
    //timeout
    public int[] dailyTemperatures1(int[] T) {
        if (T.length == 0) {
            return new int[]{};
        }
        if (T.length == 1) {
            return new int[]{0};
        }
        Stack<Integer> stack = new Stack<>();
        int[] numbers = new int[T.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                stack.push(T[j]);
                if (j == T.length - 1 && T[T.length - 1] <= T[i]) {
                    stack.clear();
                }
                if (T[j] > T[i]) {
                    break;
                }
            }
            numbers[i] = stack.size();
            stack.clear();
        }
        return numbers;
    }
    //栈的方式实现
    //递减栈
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] number = new int[T.length];
        int dump = 0;
        for (int i = T.length -1;i >= 0; i--) {
            while (!stack.isEmpty()&&T[i]>=T[stack.peek()]){
                stack.pop();
            }
            number[i] = stack.isEmpty()? 0:stack.peek()-i;
            stack.push(i);
        }
        return number;
    }
}