package com.example.testdemo.leetcode;
import com.example.testdemo.leetcode.realize.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root.right==null&&root.left==null){
            return 0;
        }
            return maxDepth(root.left)+1;
    }

}
