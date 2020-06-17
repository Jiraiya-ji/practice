package com.example.testdemo.leetcode;

import java.util.Stack;

public class EvalRPN {
    /**
     *
     * @根据逆波兰表示法，求表达式的值。
     *
     * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
     */
    public int evalRPN(String[] tokens) {
        Stack<String> stringStack = new Stack<>();
        int state = 0;
        for (int i = 0; i < tokens.length; i++) {
            //如果符合规则，则出栈计算
            if(state==2&&!isInteger(tokens[i])){
                int number1 = Integer.valueOf(stringStack.pop());
                int number2 = Integer.valueOf(stringStack.pop());
                int result = 0;

                if(tokens[i].equals("+")){
                    result = number2+number1;
                }
                if(tokens[i].equals("-")){
                    result = number2-number1;
                }
                if(tokens[i].equals("*")){
                    result = number2*number1;
                }
                if(tokens[i].equals("/")){
                    result = number2/number1;
                }
                stringStack.push(String.valueOf(result));
            }else {
                stringStack.push(tokens[i]);
            }
            if(state!=2){
                if(isInteger(tokens[i])){
                    state++;
                }else {
                    state = 0;
                }
            }
        }
        return Integer.valueOf(stringStack.peek());
    }
    public boolean isInteger(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String[] strings = {"4","13","5","/","+"};
        EvalRPN evalRPN = new EvalRPN();
        evalRPN.evalRPN(strings);
    }
}
