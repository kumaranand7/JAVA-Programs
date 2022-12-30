package com.company;

import java.util.Date;

public class DateInJava {


    public static void main(String [] args ){

        Date obj= new Date();
        System.out.println(obj);  //Tue Nov 15 18:41:14 IST 2022
        System.out.println(obj.getDate()); //15
        System.out.println(obj.getMonth()); //10
        System.out.println(obj.getYear()); //122

    }
}
