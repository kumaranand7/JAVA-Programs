package com.company;

class method_overloading {

    // this method accepts int
   static void display(int a){
        System.out.println("Got Integer: " +    a);
    }

    // this method  accepts String object
   static void display(String a){
        System.out.println("Got String: " +     a);
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}

