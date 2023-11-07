package com.hemanth.problemsolving.stacks;

import java.util.Stack;

public class MinStackLeetcode155 {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public static void main(String[] args) {

        MinStackLeetcode155 objStack = new MinStackLeetcode155();


        objStack.push(-2);
        objStack.push(0);
        objStack.push(-3);

        System.out.println(objStack.getMin());

        objStack.pop();

        System.out.println(objStack.getMin());

    }


    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else if (val < minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int val = mainStack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


   /* public static MinStack() {

    }

    public void push(int val) {

    }

    public void pop() {

    }

    public int top() {

    }

    public int getMin() {

    }*/
}
