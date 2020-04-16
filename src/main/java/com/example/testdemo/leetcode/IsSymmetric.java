package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class IsSymmetric {
    //迭代法
    public boolean isSymmetric(TreeNode root) {
        return true;
    }
    //递归法
    public boolean isSymmetric1(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            //判断是否对称
            if(!isSymmetry(list)){
               return false;
            }
        }
        return true;
    }
    public boolean isSymmetry(List list){
        for (int i = 0; i < list.size()/2; i++) {
            if(list.get(i)!= list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}
