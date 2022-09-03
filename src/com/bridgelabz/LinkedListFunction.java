package com.bridgelabz;

public class LinkedListFunction<E> {
    Node<E> head;
    Node<E> tail;
    public void addElement(E key){
        Node node = new Node<>(key);
        if (head == null){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void appending(E key){
        Node node = new Node<>(key);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public void printList(){
        Node currentNode = head;
        if (head == null){
            System.out.println("Linked List is Empty");
        }
        while (currentNode != null){
            System.out.print(currentNode.key+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void insertElement(int position, E key) {
        Node currentNode = head;
        for (int i = 0; i < (position-1); i++) {
            currentNode = currentNode.next;
        }
        Node node = new Node<>(key);
        node.next = currentNode.next;
        currentNode.next = node;
    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("Linked list is Empty");
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("Linked list is Empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        }else {
            Node currentNode = head;
            while (currentNode.next != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }
    public Node<E> search(E key){
        Node<E> currentNode = head;
        while (currentNode != null){
            if (currentNode.key.equals(key)){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
}