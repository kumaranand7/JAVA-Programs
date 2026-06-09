package com.company.Hunter.DoublyLL;

public class LinkedList {

    // pehla node — yahi se poori list shuru hoti hai
    Node head;

    // INSERT AT HEAD — O(1)

    public void insertAtHead(int data) {

        // naya node banao — data store hoga, next aur pre null honge
        Node newNode = new Node(data);

        // agar list khali hai toh naya node hi head ban jaata hai
        if (head == null) {
            head = newNode;
            return;
        }

        // naya node purane head se jodo
        newNode.next = head;

        // purana head naye node ko peeche point kare
        head.pre = newNode;

        // ab naya node hi head hai
        head = newNode;
    }

    // PRINT LIST — O(n)
    public void printList() {
        // head se shuru karo
        Node curr = head;

        // jab tak list khatam na ho
        while (curr != null) {
            System.out.print(curr.data + "==>");
            curr = curr.next; // agle node par jao
        }
        System.out.println("null");
    }
}