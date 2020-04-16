package com.example.testdemo.leetcode;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class MyPow1 {
    //初始递归，超出时间
    public double myPow(double x, int n) {
        if(n>0){
            if(n==0){
                return 1;
            }
            return x*myPow(x,n-1);
//        return Math.pow()
        }else {
            if(n==0){
                return 1;
            }
            return 1/x*myPow(x,n+1);
        }
    }
    //折半递归，即每次 * x的平方
    public static double mypow1(double x, int n){
        if(n<0){
            x = 1/x;
            n = -n;
        }
        return custompow(x,n);
    }
    public static double custompow(double x, int n){
        if(n==0){
            return 1;
        }
        double half = custompow(x,n/2);
        if(x%2==0){
            return half*half;
        }else {
            return half*half*x;
        }
    }
    //通过循环实现 pow()
    public  double myPow2(double x, int n) {
        double sum = 1.00;
        //处理正负号问题
        if(n<0){
            n = -n;
            x=1/x;
        }
        for (int i = 0; i < n; i++) {
            sum = x*sum;
        }
        return sum;
    }
    //循环快速迭代法
    public  double myPow3(double x, int n) {
        double sum = 1.00;
        //处理正负号问题
        if(n<0){
            n = -n;
            x=1/x;
        }
        for (int i = 0; i < n/2; i++) {
            sum = x*sum;
        }
        if(n%2==0){
            sum = sum*sum;
        }else {
            sum = sum*sum*x;
        }
        return sum;
    }
        public static void main(String[] args){
         System.out.println(mypow1(0.00001,2147483647));
    }
}