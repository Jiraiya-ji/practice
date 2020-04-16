package com.example.testdemo.leetcode;

/**
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class ReverseString2 {
    public void reverseString(char[] s) {
        if(s==null||s.length<1){
            return;
        }
        int left = 0;
        int right = s.length-1;
        while (left<right){
            char middle = s[left];
            s[left] = s[right];
            s[right] = middle;
            left++;
            right--;
        }
    }
}
