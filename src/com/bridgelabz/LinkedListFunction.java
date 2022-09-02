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
}