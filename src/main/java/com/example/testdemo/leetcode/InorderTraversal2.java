package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 问题，啥是中序遍历，先存储左节点
 */
public class InorderTraversal2 {
    //方法1，递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList();
        if(root==null){
            return list;
        }
        swap(root,list);
        return list;
    }
    public void swap(TreeNode root,List list){
        if(root==null){
            return;
        }
        if (root.left!=null){
            swap(root.left,list);
        }
        list.add(root.val);
        if(root.right!=null){
            swap(root.right,list);
        }
    }
    //方法二，通过迭代方式
    public List<Integer> inorderTraversal1(TreeNode root) {
        List list = new ArrayList();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        TreeNode treeNode = root;
        while (!stack.empty()){
            //把最左边的进行压入
            while (treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.left;
            }
            treeNode=stack.pop();
            list.add(treeNode.val);
            treeNode=treeNode.right;
        }
        return list;
    }
}