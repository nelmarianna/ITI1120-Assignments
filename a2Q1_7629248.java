
// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 1
import java.util.Scanner;

public class a2Q1_7629248 {

	public static void main(String [] args)
	{
		/* 
		================================================== 
		question 1
		================================================== 
		*/ 
		//initiate scanner
		Scanner in= new Scanner(System.in);
		
		//declare variables of type int for the sides of the triangle, and type boolean 
		int x,y,z;
		boolean triangle;
		
		//Prompt user to enter three numbers
		System.out.println("Please enter the three sides of the triangle: ");
		
		//read the three sides
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		//call isTriangle method
		triangle=isTriangle(x,y,z);
		
		//print the result
		if(triangle==true)
		{	
			System.out.println("The three lengths determine a triangle");
		}
		else
		{
			System.out.println("There is no triangle whose sides have length: "+x+" "+y+" "+z);
		}
	}
	
	public static boolean isTriangle(int x, int y, int z)
	{
		//declare variable of type boolean
		boolean triangle;
		
		//if statements testing conditions
		if(x<=0 ||y<=0 || z<=0)
		{
			triangle = false;
		}
		else if(x>y+z || y>x+z || z>x+y)
		{
			triangle=false;
		}
		else
		{
			triangle=true;
		}
		
		return triangle;
	}
}
