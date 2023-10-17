package com.hemanth.stackdatastructure.problems;

import java.util.Stack;

public class SymmetricTreeProblem {



    public static void main(String[] args) {



        // is Symmetric == true
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));

        System.out.println("---------------------------");


        // Is Symmetric == false
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root2));

    }


    private static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root.right);
        stack.push(root.left);

        while (!stack.isEmpty()) {
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();

            if (n1 == null && n2 == null) {
                continue;
            }

            if (n1 == null || n2 == null || n1.val != n2.val) {
                return false;
            }

            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);

        }
        return true;
    }


}
