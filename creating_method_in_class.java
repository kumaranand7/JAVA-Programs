package com.company;
class employee{
    int salary;
    int id;
    String name;

    public void printdetail()
    {
        System.out.println("name=" +name);
        System.out.println("salary=  "+salary);
       System.out.println("id= "+id +"\n" );

    }
}

public class creating_method_in_class {

    public static void main(String[] args) {

        employee obj1= new employee();
        employee obj2= new employee();

        obj1.salary=2000;
        obj1.id=34;
        obj1.name="anand";

       obj1.printdetail();

        obj1.salary=3000;
        obj1.id=74;
        obj1.name="Mukul";

        obj1.printdetail();
    }
}