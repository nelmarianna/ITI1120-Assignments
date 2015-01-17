//import scanner
import java.util.Scanner;

public class A5Q1 
{
	
	public static void main (String [] args)
	{
		//initiate scanner
		Scanner in= new Scanner(System.in);
		
		//create a variable to hold he user's input
		int user;
		
		
		//prompt user to enter an integer
		System.out.println("Please enter an integer: ");
		
		//read input from user
		user=in.nextInt();
		
		//call digitSum method
		int sum= digitSum(user);
		
		//call digialRoot method
		int root= digitalRoot(user);
		
		//print the digitalSum and digitalRoot
		System.out.println("Sum: "+sum+"\nRoot: "+root);
		
	}
	
	public static int digitSum(int x)
	{
		//declare variable sum
		int sum;
		
		//check if x is equal to 0
		if(x==0)
    	{
			//if so let sum =0
    		sum=x;
    	}
    	else
    	{
    		//let sum call method digitSum and add the 
    		//return value to the remainder of the number
    		sum = digitSum(x/10)+x%10;
    	}
    	//return sum
    	return sum;
	}
	
	public static int digitalRoot(int y)
	{
		//find the digit sum of y
		int sum=digitSum(y);
		
		//declare new variable to hold the root
		int root;
		
		//call method to calculate the number of digits
		int num= numOfDig(sum);
		
		//check if the number of digits is 1
		if(num==1)
		{
			//if so return the most recent sum calclated
			return sum;
		}
		else
		{
			//make root equal to the most recent sum
			root=digitalRoot(sum);
			
			//return the root to the main method
			return root;
		}
	
		
	}
	
	//recursive method for calculating the number of digits
	public static int numOfDig(int z)
	{
		int counter;
			
	   	if(z<=0)
	   	{
	   		counter=0;
	   	}
	   	else
	   	{
	   		counter = numOfDig(z/10);
	   		counter++;
	   	}
	   	
	   	return counter;
	}
}

