package com.company;

public class javaException {
    public static void main(String[] args) {

        int a=90,b=2,c;
        try {
            c = a / b;
            System.out.println(c);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
