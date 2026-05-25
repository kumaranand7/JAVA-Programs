package com.company.Hunter.LinkedinList;

public class LinkedList {
    Node head; // pehla node — yahi se poori list shuru hoti hai

    void insertAtEnd(int data) {

        // Step 1: naya node banao
        // data store hoga, next automatically null hoga
        Node newNode = new Node(data);

        // Step 2: agar list khali hai
        // toh naya node hi head ban jaata hai
        if (head == null) {
            head = newNode;
            return;
        }

        // Step 3: last node dhundo
        // curr.next == null matlab yahi last node hai
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Step 4: last node ko naye node se jodo
        curr.next = newNode;
    }


    //inset at head

    void insetAtHead(int data){  //array o(n) //LL o(n)

        Node newNode = new Node(data); //Step 1: naya node banao

        Node headnode= head;
        newNode.next=head;    // Step 2: naye node ka next purane head se jodo
        head=newNode;   // Step 3: head ko naya node banao
    }

    void printLinkedList() {

        // head se shuru karo
        Node curr = head;

        // jab tak list khatam na ho, print karte raho
        while (curr != null) {
            System.out.print(curr.data + "==> ");
            curr = curr.next; // agle node par jao
        }

        // list ka end
        System.out.println("null");
    }
}