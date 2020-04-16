package com.example.testdemo.leetcode;

/**
 *
 *  实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 */
public class mySqrt {
    //超级暴力法
    public int mySqrt2(int x) {
        int i = 0;
        while (i*i<=x){
            i++;
        }
        i--;
        return i;
    }
    //二分法 a²<=x<=(a+1)²，则称 a 为 x 的整数平方根
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long low = 1;
        long high = x;
        while (low<=high){
            long middle = (low+high)/2;
//            int middle = (low+high)/2;
            if(middle*middle<x&&(middle+1)*(middle+1)>x||middle*middle==x){
                return (int)middle;
            }else if(middle*middle>x){
                high = middle-1;
            }else {
                low = middle+1;
            }
        }
        return (int)low;
    }
    public int mySqrt3(int x) {
        int left = 0;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqr = mid * mid; // 该值为 mid ^ 2，如果 mid 使用 int，在 x=2147395599 时, 则 mid * mid 会先越界，再被转型成 long
            int nextSqr = (mid + 1) * (mid + 1); // 该值为（mid + 1）^ 2，

            if (sqr == x || (sqr < x && nextSqr > x)) {
                return  mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else if (sqr > x) {
                right = mid - 1;
            }
        }
        return x;
    }

}
