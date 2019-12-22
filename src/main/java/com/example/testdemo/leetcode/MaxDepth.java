package com.example.testdemo.leetcode;
import com.example.testdemo.leetcode.realize.TreeNode;

import java.util.LinkedList;

/**
 * 二叉树的最大深度
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            int left_height = maxDepth(root.left);
            int reight_height = maxDepth(root.right);
            return Math.max(left_height,reight_height)+1;
        }
//            return maxDepth(root.left)+1;
    }
    public int maxDepth1(TreeNode root){
        if(root==null)
            return 0;
        LinkedList<Record> queue = new LinkedList<>();
        queue.add(new Record(root, 1));
        int depth = 0;
        Record curr;
        while(!queue.isEmpty()){
            curr = queue.poll();
            depth = Math.max(depth, curr.level);
            if(curr.node.left!=null)
                queue.add(new Record(curr.node.left, curr.level+1));
            if(curr.node.right!=null)
                queue.add(new Record(curr.node.right, curr.level+1));
        }
        return depth;
    }
    public class Record{
        TreeNode node;
        int level;
        Record(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

}
