package com.company.Hunter.DoublyLL;

public class Main {

    public static void main(String[] args) {
        //insert node

//        Node head  = new Node(2);
//        head.next= new Node(3);
//        head.next.pre=head;
//        head.next.next=new Node(6);
//        head.next.next.pre=head.next;

        LinkedList l1=new LinkedList();


        l1.insertAtHead(10);
        l1.insertAtHead(20);
        l1.insertAtHead(30);
        l1.insertAtHead(40);
        l1.printList();

        l1.deleteHead();
        l1.printList();

        l1.deleteLastNode();
        l1.printList();

        l1.reverseDoublyLL();
        l1.printList();


    }
}
