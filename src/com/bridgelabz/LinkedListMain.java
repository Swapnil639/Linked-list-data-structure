package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked list program");
        LinkedListFunction linkedList = new LinkedListFunction();
        linkedList.addElement(70);
        linkedList.addElement(30);
        linkedList.addElement(56);
        linkedList.printList();

        LinkedListFunction linkedList1 = new LinkedListFunction();
        linkedList1.appending(70);
        linkedList1.appending(30);
        linkedList1.appending(56);
        linkedList1.printList();

        linkedList.insertElement(3,7);
        linkedList.printList();

        linkedList.deleteFirst();
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();

        if ( linkedList.search(30) == null){
            System.out.println("key is absent");
        }else {
            System.out.println("key is present");
        }
    }
}
