package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedListFunction linkedList = new LinkedListFunction();
        linkedList.addElement(70);
        linkedList.addElement(30);
        linkedList.addElement(56);
        linkedList.showLinkedList();
        LinkedListFunction linkedList1 = new LinkedListFunction();
        linkedList1.appending(70);
        linkedList1.appending(30);
        linkedList1.appending(56);
        linkedList1.appending(75);
        linkedList1.appending(80);
        linkedList1.showLinkedList();
        linkedList1.insertElementAtPosition(2, 5);
        linkedList1.showLinkedList();
        linkedList1.firstElementDelete();
        linkedList1.showLinkedList();
        linkedList1.lastElementDelete();
        linkedList1.showLinkedList();
        if (linkedList1.search(51) == null) {
            System.out.println("Element Absent in Linked list");
        } else {
            System.out.println("Element Present in Linked list");
        }
        linkedList1.insertElementAfterAnyKey(56, 89);
        linkedList1.showLinkedList();
     }
   }
