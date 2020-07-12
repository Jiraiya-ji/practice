package com.example.testdemo.leetcode;
import java.util.Stack;

/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 *
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 *
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 *
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 */

public class DecodeString {
    public String decodeString(String s) {
       Stack<Integer> stackNumber = new Stack<>();
       Stack<String> stringStack = new Stack<>();
       StringBuilder res = new StringBuilder();
       int count = 0;
       char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='['){
                stackNumber.push(count);
                count = 0;
                stringStack.push(res.toString());
                res = new StringBuilder();
            }else if(chars[i]==']'){
                StringBuilder out = new StringBuilder();
                int number =stackNumber.pop();
                for (int j = 0; j < number; j++) {
                    out.append(res);
                }
                res = new StringBuilder(stringStack.pop()+out);
            }else if(chars[i]>='0'&&chars[i]<='9'){
                count = count*10+chars[i]-'0';
            }else {
                res.append(chars[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        String s = "100[leetcode]";
        String result = new DecodeString().decodeString(s);
        System.out.println(result);
    }
}
