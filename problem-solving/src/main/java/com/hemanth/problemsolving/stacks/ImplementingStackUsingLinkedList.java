package com.hemanth.problemsolving.stacks;

public class ImplementingStackUsingLinkedList {


    private StackLinkNode top;
    private int capacity;
    private int size;

    public class StackLinkNode {
        private int data;
        private StackLinkNode next;

        public StackLinkNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ImplementingStackUsingLinkedList(int capacity) {
        this.capacity = capacity;
    }


    public void push(int data) {

        if (capacity == size) {
            throw new RuntimeException("Stack overflow");
        }
        StackLinkNode temp = new StackLinkNode(data);
        temp.next = top;
        top = temp;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }

        StackLinkNode temp = top;
        top = temp.next;
        size--;
        return temp.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }

        return top.data;
    }

    public int stackCapacity() {
        return capacity;
    }

    public int stackSize() {
        return size;
    }


    public static void main(String[] args) {


        ImplementingStackUsingLinkedList stack = new ImplementingStackUsingLinkedList(5);

        System.out.println("Stack capacity -> " + stack.capacity);
        System.out.println("stack size -> " + stack.size);

        System.out.println("isEmpty -> " + stack.isEmpty());

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        //  stack.push(35); stack overflow error

        System.out.println("stack size -> " + stack.size);

        System.out.println("stack top -> " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // System.out.println("stack top -> " + stack.peek()); stack underflow error

        //  stack.pop(); stack underflow error

    }
}
