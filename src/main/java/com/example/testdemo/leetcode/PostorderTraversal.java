package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *  给定一个二叉树，返回它的 后序 遍历。
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        swap(list,root);
        return list;
    }
    //递归
    public void swap(List list,TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        if(treeNode.left!=null){
            swap(list,treeNode.left);
        }
        if(treeNode.right!=null){
            swap(list,treeNode.right);
        }
        list.add(treeNode.val);
    }
}
