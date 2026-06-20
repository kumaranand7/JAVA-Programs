package com.company;
import java.util.Scanner;
public class pgr4_precedence {

    public static void main(String[] args) {

        int a=5;

        System.out.println(a++); //5
        System.out.println(a);  //6
        System.out.println(++a);  //7
        System.out.println(a++); //7
        System.out.println(a); //8

    }
}
