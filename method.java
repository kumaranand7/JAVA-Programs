package com.company;

public class method {


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation  //no need if staic keyword in declaration part
        //methode obj = new method();
        //c = obj.logic(a, b);
        c = logic(a, b);        //method call
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }

    static int logic(int x, int y){          //method declaration
        int z;
        if(x>y){
            z = x+y;
        }                                                   //method definition
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


}