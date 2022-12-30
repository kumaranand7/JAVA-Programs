
package com.company;


class AAA{

    int fab(int n){

        if (n<=1 )
            return n;

else
            return  fab(n-1)+fab(n-2);


    }

}



public class factional
{


    public static void main(String[] args) {

        AAA obj= new AAA();



for(int i=0; i<=5; i++) {
    System.out.print(i + " ");
}

    }


}

