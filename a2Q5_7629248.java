// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 5

import java.util.Scanner;
public class a2Q5_7629248
{
	
	public static void main (String [] args)
	{
		/* 
		================================================== 
		question 5
		================================================== 
		*/
		//initiate scanner
		Scanner in = new Scanner(System.in);
		
		//declare variables of type int to hold the length of the rectangle
		int m;
		
		//prompt user to enter an integer greater than 1
		System.out.println("Please enter the length of the rectangle(greater than 1): ");
		
		//read users input
		m= in.nextInt();
		
		//call method draw_rectangle
		draw_rectangle(m);
		
	}
	
	public static void draw_rectangle(int m)
	{
		for (int x=0;x<m; x++)
		{
			System.out.print("*");
		}
		
		
		System.out.print("\n*");
		
		
		for (int x=0;x<m-2; x++)
		{
			System.out.print(" ");
		}
		
		
		System.out.print("*\n");
		
		
		for (int x=0;x<m; x++)
		{
			System.out.print("*");
		}
		
	}
	

}
