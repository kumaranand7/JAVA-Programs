package com.company;
  // Java program to demonstrate working of split()
    public class split_function {
        public static void main(String args[])
        {
            String str = "Anand is- :1-Smart,2-thin,3-Intelligent ";
            String[] arrOfStr = str.split("[:,]");

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }


