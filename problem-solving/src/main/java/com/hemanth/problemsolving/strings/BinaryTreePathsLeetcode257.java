package com.hemanth.problemsolving.strings;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsLeetcode257 {


    private TreeNode root;

    List<Integer> path = new ArrayList<>();

    public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {


        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(5);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;

        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

    }

    public void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " --> ");
        path.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {


        BinaryTreePathsLeetcode257 binaryTree = new BinaryTreePathsLeetcode257();

        binaryTree.createBinaryTree();

        binaryTree.preOrder(binaryTree.root);

        System.out.println(binaryTree.path);
    }
}
