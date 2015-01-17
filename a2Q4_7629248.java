// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 4

import java.util.Scanner;
public class a2Q4_7629248 {
	
	/* 
	================================================== 
	question 4
	================================================== 
	*/
	public static void main(String [] args)
	{
		
		//initiate scanner
		Scanner in = new Scanner(System.in);
		
		//declare variable of type int for the nth value and type double for the total;
		int n;
		double total;
		
		//prompt user to enter a number
		System.out.println("Enter an integer: ");
		
		//read input
		n=in.nextInt();
		
		//call method compute_series
		total= compute_series(n);
		
		//print the total
		System.out.println(total);
		
	}

	public static double compute_series(int n)
	{
		//declare variable of type int for counter and double for total
		int i;
		double total=0;
		int m=n;
		
		//run loop 
		for(i=0;i<m;i++)
		{
			total= (total+1/ Math.pow(n,2));
			n--;
		}
		
		//return the total to the main method
		return total;
	}
}
