//program to check even odd using method


import java.util.Scanner;
class Even_Odd1{
    public static void main (String args[]){

        Scanner scan=new Scanner(System.in);
//create a scanner object for input

        System.out.print("Enter the number for check odd or even: ");

        int num=scan.nextInt();
//reads the value from the user
        find_Oddeven(num);//calling the method
    }

    //create a user defined metod
    static void find_Oddeven(int num){//method definition
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}