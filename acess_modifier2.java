package com.company;

class Employeeee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public  class acess_modifier2 {
    public static void main(String[] args) {
        Employeeee emp1 = new Employeeee();

        emp1.setName("Anand");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}