package com.example.testdemo;


import java.util.*;

public class TestCallback {
    public int[] twoSum(int[] nums, int target) {
        int[] numbersOne = {1, 2, 3, 4};
        int[] numbersTwo = {5, 6, 7, 8};
        List array = new ArrayList<Integer>();
        for (int i = 0; i < numbersOne.length; i++) {
            array.add(numbersOne[i]);
        }
        for (int i = 0; i < numbersOne.length; i++) {
            array.add(numbersTwo[i]);
        }
        Collections.sort(array);
        if (array.size() / 2 != 0) {

        }
        return null;
    }

    /*

     */
    public static void main(String[] args) {
        TestCallback testCallback = new TestCallback();
        testCallback.checkPalindromeNumber("asyysa");

    }

    public boolean checkPalindromeNumber(String s) {
        char[] array = s.toCharArray();
        //偶数
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i-1]) {
                    System.out.println("非回文数");
                    return false;
                }
            }
        }
        //奇数
        else {
            for (int i = 0; i < (array.length / 2 - 1); i++) {
                if (array[i] != array[array.length - i-1]) {
                    System.out.println("非回文数");
                    return false;
                }
            }
        }
        System.out.println("回文数");
        return true;
    }
}