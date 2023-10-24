package com.hemanth.treedatastructure;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
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

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first; // root -----> first   // root -> 1
        first.left = second;
        first.right = third; // second <----- first -----> third   // 2 <- 1 -> 3

        second.left = fourth;
        second.right = fifth; // fourth <----- second -----> fifth    // 4 <- 2 -> 5

        third.left = sixth;
        third.right = seventh; // sixth <----- third -----> seventh   // 6 <- 3 -> 7
    }


    // using recursion approach
    public void preOrderRecursion(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    // using iterative approach
    public List<Integer> preOrderIteration(TreeNode root) {

        List<Integer> preOrderTraversal = new ArrayList<>();

        if (root == null) {
            return preOrderTraversal;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
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

    // In-Order traversal using recursion approach
    public void inOrderRecursion(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRecursion(root.left);
        System.out.print(root.data + " ");
        inOrderRecursion(root.right);
    }

    // In-Order traversal using iterative approach
    public List<Integer> inOrderUsingIteration(TreeNode root) {
        List<Integer> inOrderTraversal = new ArrayList<>();
        if (root == null) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                inOrderTraversal.add(temp.data);
                temp = temp.right;
            }
        }
        return inOrderTraversal;
    }

    // post-order traversal using recursion
    public void postOrderRecursion(TreeNode root){
        if (root == null){
            return;
        }

        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.createBinaryTree();

        System.out.println("Pre-order traversal using recursion approach: ");
        binaryTree.preOrderRecursion(binaryTree.root);


        System.out.println("\n ------------------------------- \n");

        System.out.println("Pre-order traversal using iterative approach");
        List<Integer> preOrderTraversal = binaryTree.preOrderIteration(binaryTree.root);
        System.out.println("\nPreOrder Traversal " + preOrderTraversal.toString());


        System.out.println("\n ------------------------------- \n");
        System.out.println("In-order traversal using recursion approach");
        binaryTree.inOrderRecursion(binaryTree.root);


        System.out.println("\n ------------------------------- \n");
        System.out.println("In-order traversal using iterative approach");
        List<Integer> inOrderTraversal = binaryTree.inOrderUsingIteration(binaryTree.root);
        System.out.println("\nIn-Order Traversal " + inOrderTraversal);


        System.out.println("\n ------------------------------- \n");
        System.out.println("Post-order traversal using recursion approach");
        binaryTree.postOrderRecursion(binaryTree.root);


    }
}
