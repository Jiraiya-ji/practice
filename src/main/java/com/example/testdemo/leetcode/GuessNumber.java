package com.example.testdemo.leetcode;

public class GuessNumber extends GuessGame {
    //别人会告诉你，这个接口是定义好的，我只需去猜
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
            int middle =  low + (high - low) / 2;
            int result = guess(middle);
            if(result==0){
                return middle;
            }else if(result==-1){
                low = middle+1;
            }else {
                high=middle-1;
            }
        }
        return low;
    }
}
class GuessGame{
    int guess(int num){
        return num;
    }
}
