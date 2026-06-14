package com.company.Hunter.DoublyLL;

import java.util.Stack;

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


    public void deleteHead() {

        // agar list khali hai toh delete nahi kar sakte
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        //next node ko head bna do
        head = head.next;

        // head ka pre null kr do
        head.pre = null;
    }

    public void deleteLastNode() {

        // agar list khali hai toh delete nahi kar sakte
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        // last node tak pahuncho
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next; // agle node par jao
        }

        // last node ke pehle wale node ka next null karo
        curr.pre.next = null;
    }


    void reverseDoublyLL() {

        // agar list khali hai toh reverse nahi kar sakte
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node curr = head;
        Node tmp;
        Node lastNode = null; // loop ke baad naya head yahi hoga

        while (curr != null) {

            // agle node ko save karo — swap ke baad kho jaayega
            tmp = curr.next;

            // next aur pre swap karo
            curr.next = curr.pre; // next ab peeche point karega
            curr.pre = tmp;       // pre ab aage point karega

            // curr ko save karo — yahi naya head banega
            lastNode = curr;

            // swap ke baad aage badhne ke liye curr.pre use karo
            // kyunki swap ke baad pre hi naya next hai
            curr = curr.pre;
        }

        // lastNode = sabse aakhri node jahan curr tha = naya head
        head = lastNode;

        //    Time: O(n)
        //    Space: O(1)
    }


    void reverseUsingStack() {

        //    Step 1: Stack mein saare data daalo
        //    Step 2: tmp = head reset karo
        //    Step 3:Stack se nikalo aur data replace karo



        // stack banao — LIFO principle follow karega
        Stack<Integer> s1 = new Stack<>();

        // Step 1: saare nodes ka data stack mein daalo
        Node tmp = head;
        while (tmp != null) {
            s1.push(tmp.data);
            tmp = tmp.next;
        }

        // tmp wapas head par le aao
        // kyunki pehle loop ke baad tmp = null ho gaya tha
        tmp = head;

        // Step 2: stack se nikalo aur list mein daalo
        while (tmp != null) {
            tmp.data = s1.pop();
            tmp = tmp.next;
        }

    }

//    Time: O(n) 
//    Space: O(n)
}