package com.hemanth.stackdatastructure.linkedlist;

import java.util.EmptyStackException;

public class LinkedListStack {

    private ListNode top;
    private int length;

    public LinkedListStack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
