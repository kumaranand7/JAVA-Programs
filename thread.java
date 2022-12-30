package com.company;



class anand extends Thread
{

        int i=0;
   public void run() {
        while (i < 200) {
            System.out.println("Anand is chalak");
            i++;
        }
    }


}

class amit extends Thread
{
    int i=0;
  public   void run() {
        while (i < 200) {
            System.out.println("Amit is Buddhu");
            i++;
        }
    }


}



public class thread {

    public static void main(String[] args) {
        anand obj1=new anand();
        obj1.start();
        amit obj2=new amit();
        obj2.start();

    }
}
