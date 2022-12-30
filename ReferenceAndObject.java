package com.company;


class A1
{

    void A(){
        System.out.println("A is called");
    }
    void Z(){
        System.out.println("Z is called");
    }

}

class B1 extends A1{

    void B(){
        System.out.println("B is called");
    }

}


public class ReferenceAndObject {

    public static void main(String[] args) {

        A1 obj1=new B1();
        obj1.A();
        obj1.Z();
//        Obj.B(); not called because we pass refeerence of A1


        A1 obj2=new A1();
        obj2.A();


        B1 obj3=new B1();
        obj3.A();
        obj3.Z();
        obj3.B();



//        B1 obj4=new A1();
////        obj4.A();
    }
}
