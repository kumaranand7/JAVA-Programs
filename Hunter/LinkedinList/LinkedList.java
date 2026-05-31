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

    void insertAtHead(int data) { // array O(n) // LL O(1)

        // Step 1: naya node banao
        Node newNode = new Node(data);

        // Step 2: naye node ka next purane head se jodo
        newNode.next = head;

        // Step 3: head ko naya node banao
        head = newNode;
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

    void deleteAtHead(){
        if(head==null){  //agar list empty hai
            System.out.println("List is empty");
            return;
        }
       head=head.next; //head ke next ko head bna do

    }


    void deleteNode(int data) {
        // Step 1: khali list check

        if(head==null){  //agar list empty hai
            System.out.println("List is empty");
            return;
        }
        // Step 2: agar head ka data delete karna ho (head node me hi data ho)

        if (head.data==data){
            head=head.next;
            return;
        }

        // Step 3: loop - curr.next.data != data tak chalo
        Node curr = head;
        while(curr.next != null &&  curr.next.data!=data){    //also check if
            curr=curr.next;
        }

        if (curr.next == null) {
            System.out.println("Data not found!");
            return;
        }

        // Step 4: curr.next = curr.next.next
        curr.next= curr.next.next;
    }



    int linkedListLength() {

        // agar list khali hai toh length 0
        if (head == null) {
            return 0;
        }

        // curr se traverse shuru karo
        Node curr = head;
        int count = 1;

        // jab tak last node na aaye
        while (curr.next != null) {
            curr = curr.next; // agle node par jao
            count++;          // count badhao
        }

        // poori list ki length return karo
        return count;
    }

    boolean isElementPresent(int element) {

        // agar list khali hai toh element ho hi nahi sakta
        if (head == null) {
            return false;
        }

        // head se traverse shuru karo
        Node curr = head;

        while (curr != null) {

            // agar element mil gaya
            if (curr.data == element) {
                return true;
            }

            // agle node par jao
            curr = curr.next;
        }

        // element nahi mila
        return false;
    }

}