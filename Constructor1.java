package com.company;

class A
{
    A()
    {
        System.out.println("Contructor from Class A is called ");
    }

}
class B extends A{
    B() 
    {
        super();
        System.out.println("Contructor from Class B is called ");
    }

}


public class Constructor1 {

    public static void main(String[] args) {


      B obj2=new B();    // Contructor from Class A is called
                             //Contructor from Class B is called

        A obj1=new A();    //Contructor from Class A is called
 



    } 
} 
