//Write a Java program to find out the sum of command line arguments.

package programs;

public class labpro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Integer.parseInt(args[0]); 
		int y = Integer.parseInt(args[1]); 
		int sum = x + y;
		System.out.println("The sum of x and y is: " +sum);

	}

}
