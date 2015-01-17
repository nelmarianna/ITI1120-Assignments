// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 2
import java.util.Scanner;

public class a2Q2_7629248 {

	public static void main(String[] args) 
	{
		/* 
		================================================== 
		question 2
		================================================== 
		*/ 
		
		//initialize Scanner
		Scanner in = new Scanner(System.in);
		
		//declare a variable of type int for the input from the user 
		//and type boolean to test if it is safe or not
		int x;
		boolean safety;
		
		//prompt user to enter a number
		System.out.println("Please enter a number between 1 and 99");
		
		//read the input
		x=in.nextInt();
		
		//call the is_safe method
		safety= is_safe(x);
		
		//print result
		if (safety==true)
		{
			System.out.println("The number is safe");
		}
		else
		{
			System.out.println("The number is not safe");
		}
	}
	
	public static boolean is_safe(int x)
	{
		//declare variables
		boolean safety;
		int y,z;
		
		//let y be the first number, let x be the second
		y=x/10;
		z=x%10;
		
		if(x%9==0 || y==9 || z==9)
		{
			safety = false;
		}
		else
		{
			safety= true;
		}
		
		return safety;
	}

}
