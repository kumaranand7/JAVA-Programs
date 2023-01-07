//Write a Java program to create a Room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. 
//In this class the member functions are setData and displayData.
//Use member function to set data and display that data using 

package programs;
import java.util.Scanner;


public class labpro3 {
	
	int rno;
	String rtype; 
	boolean ac;
	float area;
	Scanner obj=new Scanner(System.in);
	void setData(int roomno,String roomtype,boolean acmachine,float rarea)
	{
		rno=roomno;
		rtype=roomtype;
		ac=acmachine;
		area=rarea;
	}
   void displayData()
   {
	   System.out.println("Roomno is: "+rno);
	   System.out.println("Roomtype is: "+rtype);
	   String s=(ac)?"yes":"no";
	   System.out.println("AcMachine needed: "+s);
	   System.out.println("Room Area is: "+area);
	   	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 labpro3 room=new labpro3();
	     room.setData(101,"Delux",true,54.3f);
	     room.displayData();
	}

}
