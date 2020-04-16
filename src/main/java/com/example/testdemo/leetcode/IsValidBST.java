package com.example.testdemo.leetcode;

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

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNodeLength record = new TreeNodeLength(root,0);
        LinkedList<TreeNodeLength> linkedList = new LinkedList();
        linkedList.add(record);
        boolean flag = true;
        while (!linkedList.isEmpty()){
            record = linkedList.pop();
            // 判断左节点
            if(record.treeNode.left!=null){
                int length = record.treeNode.val-record.treeNode.left.val;
                if((record.treeNode.left.val<record.treeNode.val&&record.treeNodeLength>=0)||
                        (record.treeNode.left.val<record.treeNode.val)&&record.treeNodeLength<=0&&(length+record.treeNodeLength)<=0){
                    linkedList.add(new TreeNodeLength(record.treeNode.left,length));
                }
                else {
                    flag = false;
                    break;
                }
            }
            // 判断右节点
            if(record.treeNode.right!=null){
                int length = record.treeNode.val-record.treeNode.right.val;
                if((record.treeNode.right.val>record.treeNode.val&&record.treeNodeLength<=0)||
                        (record.treeNode.right.val>record.treeNode.val)&&record.treeNodeLength>=0&&(length+record.treeNodeLength)>=0){
                    linkedList.add(new TreeNodeLength(record.treeNode.right,length));
                }
                else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public class TreeNodeLength{
        public int treeNodeLength;
        public TreeNode treeNode;
        TreeNodeLength(TreeNode treeNode,int treeNodeLength){
            this.treeNode = treeNode;
            this.treeNodeLength = treeNodeLength;
        }
    }
}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}
