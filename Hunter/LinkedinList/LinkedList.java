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