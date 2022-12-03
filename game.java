package com.company;
import java.util.Random;
import java.util.Scanner;

class Game4  {
    public int userinput,compinput;
    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    public int Game4()
    {

        compinput=random.nextInt(100);
        return compinput;
    }
    public int takeuserinput()
    {
        userinput=sc.nextInt();
        return userinput;
    }
    public int iscorrectInput()
    {
        if(userinput==compinput)
        {
            return 1;
        }
        else
            return 0;
    }

}
public class game
{
    public static void main(String[] args)
    {
        int y,k=0,m,n;
        Game4 ob=new Game4();
        m=ob.Game4();
        System.out.println("Welcome to the game ");
        System.out.println("In this game the computer will generate a random integer from 0-100 \n you have to guess it in least number off guesses");
        System.out.println("The computer will guide you whether your guess is greater or smaller than comp input");

        while(ob.iscorrectInput()==0)
        {
            k++;
            System.out.println("Enter your guess!!");
            n=ob.takeuserinput();
            y=ob.iscorrectInput();
            if(y==1)
            {
                System.out.print("Correct choice");
                break;
            }
            if(n>m)
                System.out.println("Your guess is Greater than computer input");
            if(n<m)
                System.out.println("Your guess is Smaller than computer input");
            System.out.println("Guess again");

        }
        System.out.println("The number of Guesses/score= "+k);
    } 
}
