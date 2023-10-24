package com.hemanth.stackdatastructure.linkedlist;

import java.util.NoSuchElementException;

public class MyStack {

    private SListNode top;
    private int length;

    private class SListNode {
        private int data;
        private SListNode next;

        public SListNode(int data) {
            this.data = data;
        }
    }

    public MyStack() {
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void push(int data) {
        SListNode temp = new SListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        SListNode result = top;
        top = top.next;
        length--;
        return result.data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return top.data;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println("Top item -> " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Top item -> " + stack.peek());

        stack.pop();
        stack.pop();

    }
}
