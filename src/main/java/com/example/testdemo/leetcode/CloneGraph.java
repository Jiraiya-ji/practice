package com.example.testdemo.leetcode;

import java.util.*;

/**
 * 给你无向 连通 图中一个节点的引用，请你返回该图的 深拷贝（克隆）。
 *
 * 图中的每个节点都包含它的值 val（int） 和其邻居的列表（list[Node]）。
 */
public class CloneGraph {
    public Node cloneGraph(Node node){
        if(node==null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node copyNode = new Node(node.val);
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        map.put(node,copyNode);
        while (!stack.isEmpty()){
            Node currentNode = stack.pop();
            System.out.println(currentNode.neighbors.size());
            for(Node n : currentNode.neighbors){
                if(!map.containsKey(n)){
                    Node newNode = new Node(n.val);
                    stack.push(n);
                    map.put(n,newNode);
                }
                //低级错误
//                currentNode.neighbors.add(map.get(n));
                map.get(currentNode).neighbors.add(map.get(n));
            }
        }
        return copyNode;
    }

    public Node cloneGraph1(Node node){
        Map<Node,Node> map = new HashMap<>();
        return dfs(map,node);
    }
    //DfS
    private Node dfs(Map<Node,Node> map,Node node){
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return node;
        }
        Node copyNode = new Node(node.val);
        map.put(node,copyNode);
        for(Node node1:node.neighbors) copyNode.neighbors.add(dfs(map,node1));
        return copyNode;
    }

    public static void main(String[] args) {
        CloneGraph cloneGraph = new CloneGraph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        List<Node> list1 = new ArrayList<>();
        list1.add(node2);
        node1.neighbors = list1;
        List<Node> list2 = new ArrayList<>();
        list2.add(node1);
        node2.neighbors = list2;
        cloneGraph.cloneGraph(node1);
//        IteratorDetail iteratorDetail = new IteratorDetail();
//        iteratorDetail.remove();
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class IteratorDetail implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}