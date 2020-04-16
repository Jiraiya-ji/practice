package com.example.testdemo;
/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class MaxProfit1 {
    public int maxProfit(int[] prices) {
        if(prices.length<1){
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int maxPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>max){
                //特殊处理最后一位
                if(i==prices.length-1){
                    maxPrice = maxPrice+ (max - min);
                }
                max = prices[i];
            }else {
                maxPrice = maxPrice+ (max - min);
                max = prices[i];
                min = prices[i];
            }
        }
        return maxPrice;
    }
    public static void main(String[] args){
        MaxProfit1 removeDuplicates = new MaxProfit1();
        int[] nums1 = {2,4,1};
        System.out.println("the nums is ："+nums1.toString()+"the length is :"+removeDuplicates.maxProfit(nums1));
    }
}

