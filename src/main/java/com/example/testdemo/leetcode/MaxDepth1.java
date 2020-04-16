package com.example.testdemo.leetcode;



/**
 *给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class MaxDepth1 {
    //递归方式
    public int maxDepth(TreeNode root) {
        //判空
        if(root==null){
            return 0;
        }
        //停止的基线条件
        if(root.left==null&&root.right==null){
            return 1;
        }
        int hight1 = maxDepth(root.left)+1;
        int hight2 = maxDepth(root.right)+1;
        return Math.max(hight1,hight2);
    }
    //迭代方式
    public int maxDepth1(TreeNode root) {
//        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
//        if (root != null) {
//            stack.add(new Pair(root, 1));
//        }
//
//        int depth = 0;
//        while (!stack.isEmpty()) {
//            Pair<TreeNode, Integer> current = stack.poll();
//            root = current.getKey();
//            int current_depth = current.getValue();
//            if (root != null) {
//                depth = Math.max(depth, current_depth);
//                stack.add(new Pair(root.left, current_depth + 1));
//                stack.add(new Pair(root.right, current_depth + 1));
//            }
//        }
        return root.val;
    }
}
