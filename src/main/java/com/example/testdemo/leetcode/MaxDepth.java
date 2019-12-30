package com.example.testdemo.leetcode;
import com.example.testdemo.leetcode.realize.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的最大深度
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(null==root){
            return 0;
        }else {
            int maxLeftDepth = maxDepth(root.left);
            int maxRightDepth = maxDepth(root.right);
            return Math.max(maxLeftDepth,maxRightDepth)+1;
        }
    }
    public int maxDepth1(TreeNode root){
        LinkedList<TreeNodeRecord> queue = new LinkedList<>();
        TreeNodeRecord treeNodeRecord = new TreeNodeRecord(1,root);
        queue.add(treeNodeRecord);
        int depth =1;
        while (!queue.isEmpty()){
            treeNodeRecord = queue.pop();
            depth = Math.max(depth,treeNodeRecord.val);
            if(treeNodeRecord.treeNode.left!=null){
                queue.add(new TreeNodeRecord(treeNodeRecord.val+1,treeNodeRecord.treeNode.left));
            }
            if(treeNodeRecord.treeNode.right!=null){
                queue.add(new TreeNodeRecord(treeNodeRecord.val+1,treeNodeRecord.treeNode.right));
            }
        }
        return depth;
    }
    public class TreeNodeRecord{
        public int val;
        public TreeNode treeNode;
        public TreeNodeRecord(int val,TreeNode treeNode){
            this.val = val;
            this.treeNode = treeNode;
        }
    }

}
