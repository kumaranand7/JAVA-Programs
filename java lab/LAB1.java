//Write a Java program to insert 3 numbers from keyboard and find out greater number among 3 numbers.

package programs;

import java.util.Scanner;
public class labpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any three number");
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		int temp = (a > b) ? a : b;
		int gr = (temp > c) ? temp : c;
		System.out.println("The greatest number is:" + gr);
		obj.close();
	}

}

	
