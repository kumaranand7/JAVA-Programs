package com.company.Hunter.LinkedinList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //INSERT at END
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(99);

        list.printLinkedList();

        //INSERT at HEAD
        list.insetAtHead(1);
        list.printLinkedList();

    }
}
