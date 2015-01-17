

// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 6

import java.util.Scanner;
public class a2Q6_7629248 {
	
	public static void main(String [ ] args)
	{
		/* 
		================================================== 
		question 6
		================================================== 
		*/
		//initiate scanner
		Scanner in = new Scanner(System.in);
				
		//declare variables of type int to hold the length of the rectangle
		int m;
				
		//prompt user to enter an integer greater than 1
		System.out.println("How tall is your tree? (enter integer) ");
				
		//read users input
		m= in.nextInt();
				
		//call method draw_rectangle
		draw_tree(m);
				
	}
	
	
	//method draw_tree that draws a tree given the height from the main method
	public static void draw_tree(int m)
	{
		//declare variables for use in the loops
		int counter=0;
		int space =1;
		int star = 1;
		
		//while loop for main part of tree
		while(counter<m)
		{
			//print m-1 #of spaces, then m-2, m-3, etc.
			for(int i=1;i<=m-space; i++)
			{
				System.out.print(" ");
			}
			
			//print 1 star then 2, then 3, etc.
			for(int j=1;j<=star; j++)
			{
				System.out.print("*");
			}
			
			//new line
			System.out.println("");
			
			//add one to space, add 2 to how
			//many stars and add one to counter
			space++;
			star=star+2;
			counter ++;	
			
		}		
		
		//print the last two stars (for trunk)
		for(int c=0; c<2; c++)
		{
			//print m-1 spaces
			for(int l=1;l<=m-1; l++)
			{
				System.out.print(" ");
				
			}
			
			//print 1 * and start new line
			for(int k=1;k<=1; k++)
			{
				System.out.print("*\n");
			}
		}
			
		
			
		
		
		
		
		
		
		
	}

}
