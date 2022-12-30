package com.company;


class AA{

    int fact(int n){
        if (n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);


    }

}



public class factorial {


    public static void main(String[] args) {

        AA obj= new AA();
        int x=obj.fact(5);
        System.out.println(x);


    }


}
