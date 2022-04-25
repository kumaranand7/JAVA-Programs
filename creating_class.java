package com.company;
class emoloyee{
    int salary;
    int id;
    String name;
}

public class creating_class {

    public static void main(String[] args) {

    emoloyee obj= new emoloyee();

          obj.salary=2000;
          obj.id=34;
          obj.name="anand";

          System.out.println(obj.salary);
          System.out.println(obj.id);
          System.out.println(obj.name);
}
}