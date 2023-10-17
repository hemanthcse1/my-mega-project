package com.hemanth.stackdatastructure.linkedlist;

public class StackImplUsingLinkedList {

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());

        stack.pop();


        System.out.println(stack.length());


        System.out.println(stack.peek());

    }


}
