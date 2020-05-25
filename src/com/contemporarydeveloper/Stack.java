package com.contemporarydeveloper;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private Node<T> top;

    private class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> t = new Node<>(item);
        t.next = top;
        top = t;
    }

    public T pop() {
        T item = null;
        if(top != null) {
            item = top.data;
            top = top.next;
        }

        return item;
    }

    @Override
    public String toString() {
        Node<T> current = top;
        List stackItems = new ArrayList<>();
        while(current != null) {
            stackItems.add(current.data);
            current = current.next;
        }

        return stackItems.toString();
    }
}
