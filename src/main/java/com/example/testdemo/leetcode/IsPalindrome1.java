package com.example.testdemo.leetcode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class IsPalindrome1 {
    public static boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }
        char[] charStr = s.toCharArray();
        int i = 0;
        int j = charStr.length-1;
        while (i<j){
            if(!((charStr[i]>='0'&&charStr[i]<='9')||(charStr[i]>='A'&&charStr[i]<='Z')||(charStr[i]>='a'&&charStr[i]<='z'))){
                i++;
                continue;
            }
            if(!((charStr[j]>='0'&&charStr[j]<='9')||(charStr[j]>='A'&&charStr[j]<='Z')||(charStr[j]>='a'&&charStr[j]<='z'))){
                j--;
                continue;
            }
            if (Character.toLowerCase(charStr[i])!=Character.toLowerCase(charStr[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void  main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
