package com.bridgelabz;

public class LinkedListFunction<E> {
    Node<E> head;
    Node<E> tail;

    public void addElement(E key) {
        Node node = new Node<>(key);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void appending(E key) {
        Node node = new Node<>(key);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void showLinkedList() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (currentNode != null) {
            System.out.print(currentNode.key + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void insertElementAtPosition(int position, E key) {
        Node currentNode = head;
        for (int i = 0; i < (position - 1); i++) {
            currentNode = currentNode.next;
        }
        Node node = new Node<>(key);
        node.next = currentNode.next;
        currentNode.next = node;
    }

    public void firstElementDelete() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        head = head.next;
    }

    public void lastElementDelete() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }

    public Node<E> search(E key) {
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void insertElementAfterAnyKey(E key, E insertElement) {
        Node node = new Node<>(insertElement);
        Node currentNode = search(key);
        boolean condition = false;
        if (currentNode != null) {
            node.next = currentNode.next;
            currentNode.next = node;
            condition = true;
        }
        if (condition == true) {
            System.out.println("Successfully added the element");
        } else {
            System.out.println("Element Absent in Linked list");
        }
    }

    public void searchElementThenDelete(E key) {
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.key != key) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = lastNode.next;
    }
}