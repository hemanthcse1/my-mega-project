package com.hemanth.problemsolving.stacks;

import java.util.Stack;

public class ImplementQueueUsingStackLeetcode232 {

    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public ImplementQueueUsingStackLeetcode232(){
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int data){
        inputStack.push(data);
    }

    public int pop(){
        while (outputStack.isEmpty()){
            transferElements();
        }
        return outputStack.pop();
    }

    public int peek(){
        while (outputStack.isEmpty()){
            transferElements();
        }

        return outputStack.peek();
    }

    public boolean empty(){
        return outputStack.isEmpty() && inputStack.isEmpty();
    }


    public void transferElements(){
        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
    }

    public static void main(String[] args) {

        ImplementQueueUsingStackLeetcode232 queueUsingStack = new ImplementQueueUsingStackLeetcode232();
        queueUsingStack.push(10);
        queueUsingStack.push(5);
        queueUsingStack.push(6);
        queueUsingStack.push(7);
        queueUsingStack.push(8);

        queueUsingStack.pop();

        System.out.println(queueUsingStack.peek());
    }



}
