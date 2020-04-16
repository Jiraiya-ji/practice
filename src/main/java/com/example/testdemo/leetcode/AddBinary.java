package com.example.testdemo.leetcode;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
    public static void main(String[] args){
        String a = "10";
        int sum1 = 0;
        for (int i = 0; i < a.length(); i++) {
            sum1+=a.charAt(i)*Math.pow(2,a.length()-1-i);
        }
        System.out.println(sum1);
    }
}
