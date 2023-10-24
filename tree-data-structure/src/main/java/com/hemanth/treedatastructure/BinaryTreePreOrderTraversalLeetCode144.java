package com.hemanth.treedatastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversalLeetCode144 {

    private PreTreeNode root;

    private class PreTreeNode {
        private PreTreeNode left;
        private PreTreeNode right;
        private int data;

        public PreTreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
       /* TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);


        root = first; // root ----> first
        first.left = second;
        first.right = third; // second <---- first -----> third

        second.left = fourth;*/

        PreTreeNode first = new PreTreeNode(1);
        PreTreeNode second = new PreTreeNode(2);
        PreTreeNode third = new PreTreeNode(3);
        PreTreeNode fourth = new PreTreeNode(4);
        PreTreeNode fifth = new PreTreeNode(5);
        PreTreeNode sixth = new PreTreeNode(6);
        PreTreeNode seventh = new PreTreeNode(7);

        root = first; // root -----> first   // root -> 1
        first.left = second;
        first.right = third; // second <----- first -----> third   // 2 <- 1 -> 3

        second.left = fourth;
        second.right = fifth; // fourth <----- second -----> fifth    // 4 <- 2 -> 5

        third.left = sixth;
        third.right = seventh; // sixth <----- third -----> seventh   // 6 <- 3 -> 7
    }

    public List<Integer> preOrderIteration(PreTreeNode root) {

        List<Integer> preOrderTraversal = new ArrayList<>();

        if (root == null) {
            return preOrderTraversal;
        }

        Stack<PreTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            PreTreeNode temp = stack.pop();
            preOrderTraversal.add(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

        return preOrderTraversal;
    }

    public static void main(String[] args) {


        BinaryTreePreOrderTraversalLeetCode144 binaryTree = new BinaryTreePreOrderTraversalLeetCode144();

        binaryTree.createBinaryTree();

        System.out.println("Pre-order traversal using recursion approach: ");
        binaryTree.preOrderIteration(binaryTree.root);
    }
}
