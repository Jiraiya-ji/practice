package com.example.testdemo;

import java.util.Arrays;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class IsValid1 {
    //优化
    public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.add(chars[0]);
        //修改下
        for (int i = 1; i < chars.length; i++) {
            if(!stack.isEmpty()){
                char pollChar = stack.peek();
                if(isEquals(pollChar,chars[i])){
                    stack.pop();
                }else {
                    stack.push(chars[i]);
                }
            }else {
                stack.push(chars[i]);
            }
        }
        return stack.size() <= 0;
    }
    public boolean isEquals(char a1,char a2){
        char[] chars1 = {a1,a2};
        char[] chars2 = {'(',')'};
        char[] chars3 = {'{','}'};
        char[] chars4 = {'[',']'};
        if(Arrays.equals(chars1,chars2)){
            return true;
        }
        if(Arrays.equals(chars1,chars3)){
            return true;
        }
        if(Arrays.equals(chars1,chars4)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        IsValid1 isValid1 = new IsValid1();
        boolean flag = isValid1.isValid("[])");
        System.out.println(flag);
    }
}
