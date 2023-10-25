package com.hemanth.problemsolving.stacks;

public class ImplementingStackUsingArray {


    private int top;
    private int capacity;
    private int size;
    private int[] stack;

    public ImplementingStackUsingArray(int capacity) {
        this.top = -1;
        this.size = 0;
        this.capacity = capacity;
        stack = new int[capacity];
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("Stack  overflow........");
        }
        top++;
        size++;
        stack[top] = data;

    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow........");
        }

        stack[top] = 0;
        top--;
        size--;
    }

    public static void main(String[] args) {
        ImplementingStackUsingArray stack = new ImplementingStackUsingArray(5);

        System.out.println("top -> " + stack.capacity);

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        //  stack.push(30); stack overflow error

        System.out.println("size -> " + stack.size);

        System.out.println("is Full -> " + stack.isFull());


        System.out.println("Print top element of the stack -> " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("size -> " + stack.size);
        System.out.println("is Full -> " + stack.isFull());

        System.out.println("isEmpty() -> " + stack.isEmpty());

        // stack.pop(); stack underflow error

    }
}
