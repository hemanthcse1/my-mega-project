package com.hemanth.queuedatastructure.usinglinkedlist;

public class MyQueue {


    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }


    public void print() {
        if (isEmpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();


        System.out.println("Is queue empty -> " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);

        System.out.println("length -> " + queue.getLength());
        queue.print();

        queue.dequeue();
        queue.dequeue();

        System.out.println("length -> " + queue.getLength());
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
