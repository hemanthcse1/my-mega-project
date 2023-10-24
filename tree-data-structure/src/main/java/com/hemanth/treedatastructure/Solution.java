package com.hemanth.treedatastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    private SSTreeNode root;

    private class SSTreeNode {
        private SSTreeNode left;
        private SSTreeNode right;
        private int data;

        public SSTreeNode(int data) {
            this.data = data;
        }
    }

    public void createSBinaryTree() {




        SSTreeNode first = new SSTreeNode(1);
        SSTreeNode second = new SSTreeNode(2);
        SSTreeNode third = new SSTreeNode(3);
        SSTreeNode fourth = new SSTreeNode(4);
        SSTreeNode fifth = new SSTreeNode(5);
        SSTreeNode sixth = new SSTreeNode(6);
        SSTreeNode seventh = new SSTreeNode(7);


        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;


    }

    public List<Integer> inOrderTraversal(SSTreeNode root) {
        List<Integer> inOrderTraversall = new ArrayList<>();

        if (root == null) {
            return inOrderTraversall;
        }
        Stack<SSTreeNode> stack = new Stack<>();
        SSTreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                inOrderTraversall.add(temp.data);
                temp = temp.right;
            }
        }

        return inOrderTraversall;

    }

    public static void main(String[] args) {

        Solution bt = new Solution();

        bt.createSBinaryTree();

        System.out.println(bt.inOrderTraversal(bt.root));
    }
}
