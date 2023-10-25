package com.hemanth.treedatastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversalLeetcode94 {

    private STreeNode root;

    private class STreeNode {
        private STreeNode left;
        private STreeNode right;
        private int data;

        public STreeNode(int data) {
            this.data = data;
        }
    }

    public void createSBinaryTree() {




        STreeNode first = new STreeNode(1);
        STreeNode second = new STreeNode(2);
        STreeNode third = new STreeNode(3);
        STreeNode fourth = new STreeNode(4);
        STreeNode fifth = new STreeNode(5);
        STreeNode sixth = new STreeNode(6);
        STreeNode seventh = new STreeNode(7);


        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;


    }

    public List<Integer> inOrderTraversal(STreeNode root) {
        List<Integer> inOrderTraversal = new ArrayList<>();

        if (root == null) {
            return inOrderTraversal;
        }
        Stack<STreeNode> stack = new Stack<>();
        STreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                inOrderTraversal.add(temp.data);
                temp = temp.right;
            }
        }

        String path = String.valueOf(temp.data);

        path.add(temp.data);

        return inOrderTraversal;

    }

    public static void main(String[] args) {

        BinaryTreeInOrderTraversalLeetcode94 bt = new BinaryTreeInOrderTraversalLeetcode94();

        bt.createSBinaryTree();

        System.out.println(bt.inOrderTraversal(bt.root));
    }
}
