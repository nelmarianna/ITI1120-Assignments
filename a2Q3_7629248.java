// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 3

import java.util.Scanner;
public class a2Q3_7629248 
{
	
	public static void main(String[] args) 
	{
	/* 
	================================================== 
	question 3
	================================================== 
	*/
		//initiate Scanner
		Scanner in = new Scanner(System.in);
		
		//declare variables of type int for the years 
		//and type boolean to test
		int mYear, year;
		boolean test;
		
		//prompt user to enter the model year
		System.out.println("Enter the model year: ");
		
		//read user's input 
		mYear= in.nextInt();
		
		//prompt user to enter the year
		System.out.println("Enter the year: ");
		
		//read user's input
		year= in.nextInt();
		
		//call method test_needed
		test= test_needed(mYear, year);
		
		//print the result
		if(test==true)
		{
			System.out.println("An emission test is needed.");
		}
		else
		{
			System.out.println("An emission test is not needed.");
		}

	}
	
	public static boolean test_needed(int mYear,int year)
	{
		//declare variables
		boolean test;
		
		//test conditions for emissions test
		if((mYear%2==0 && year%2!=0)&&(year-mYear<=20 && year-mYear>=3))
		{
			test=true;
		}
		else if((mYear%2!=0 && year%2==0)&&(year-mYear<=20 && year-mYear>=3))
		{
			test=true;
		}
		else
		{
			test= false;
		}
		
		//return the boolean to the main method
		return test;
	}

}
