package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    //通过递归实现
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        swap(list, root);
        return list;
    }

    public void swap(List list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        swap(list, root.left);
        swap(list, root.right);
    }

    //通过循环实现
    public List<Integer> preorderTraversal1(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack();
        List<Integer> list = new ArrayList<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode treeNode =  stack.pop();
            list.add(treeNode.val);
            if(treeNode.left!=null){
                stack.push(treeNode.left);
            }
            if(treeNode.right!=null){
                stack.push(treeNode.right);
            }
        }
        return list;
    }
}