//Write a Java program to create a class “SimpleObject” and display message by using constructor of this class.

package programs;


class SimpleObject
{
SimpleObject() 
{
System.out.println("No argument Constructor");
}
SimpleObject(int a) 
{
System.out.println("One argument Constructor");
}
}
public class labpro4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleObject s1 = new SimpleObject();
		SimpleObject s2 = new SimpleObject(100);
	}
}






