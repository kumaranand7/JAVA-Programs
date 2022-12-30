package com.company;

 interface Bikee {
     int a=100;

     void bre(int decrement);
     void acc(int increment);

}
interface Car {
    void ring();

}
class hero implements Bikee,Car{

     public void bre(int decrement) {
        System.out.println("spped is decreamented");
    }

    @Override
    public void acc(int increment) {
        System.out.println("spped is incremented");
    }

    void horn() {
        System.out.println("peee peeepooo pooo");
    }

    @Override
    public void ring() {
        System.out.println("popopopopopo");
    }


}

public class Bike{
public static void main(String[]args)
{
hero obj =new hero();
obj.bre(5);
obj.horn();
obj.ring();


        }
        }