package com.example.testdemo.leetcode;

import com.example.testdemo.leetcode.realize.TreeNode;

import java.util.LinkedList;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树
 */
public class SolutionOfIsValidBST {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        boolean falg = true;
        while (!linkedList.isEmpty()){
            TreeNode pop = linkedList.pop();
            //树节点与左节点比较
            if(pop.left!=null){
                if(pop.left.val>=pop.val){
                    falg = false;
                    break ;
                }
                else {
                    linkedList.add(pop.left);
                }
            }
            //树节点与右节点比较
            if(pop.right!=null){
                if(pop.right.val>=pop.val){
                    falg = false;
                    break ;
                }
                else {
                    linkedList.add(pop.left);
                }
            }
        }
        return falg;
    }
}
