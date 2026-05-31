package com.company.Hunter.LinkedinList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //INSERT at END
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(99);

        list.printLinkedList(); //5==> 10==> 15==> 99==> null

        //INSERT at HEAD
        //INSERT at HEAD
        list.insertAtHead(1);
        list.printLinkedList(); //1==> 5==> 10==> 15==> 99==> null

        //delete at head
        list.deleteAtHead();
        list.printLinkedList();//5==> 10==> 15==> 99==> null

        //remove node 10
        list.deleteNode(10);
        list.printLinkedList();  //5==> 15==> 99==> null

        //length of the list
        int length= list.linkedListLength();
        System.out.println(length); //3

        //search element
        System.out.println(list.isElementPresent(5));

    }
}
