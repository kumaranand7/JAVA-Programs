package com.company.Hunter.LinkedinList;

public class Node {

    int data; // node ka actual value — jo store karna hai
    Node next; // agli node ka address — isse list judi rehti hai

    Node(int data) {

        // jo value di hai woh store karo
        this.data = data;

        // abhi koi agle node nahi pata
        // baad mein jab list mein add karenge tab connect karenge
        this.next = null;
    }
}