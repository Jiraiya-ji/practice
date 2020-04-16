package com.example.testdemo.leetcode;

import java.util.List;

/**
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 */
public class GenerateTrees {
    //递归方法实现
    public List<TreeNode> generateTrees(int n) {
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode0.left = treeNode1;
        treeNode0.right = treeNode2;
        return null;
    }
}
