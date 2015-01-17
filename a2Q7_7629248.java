
// Family name, Given name: Opolski, Aniela
// Student number:7629248
// Course: IT1 1120
// Assignment Number 2 Question 6

import java.util.Scanner;

public class a2Q7_7629248 
{

	//initiate scanner and counter globally
	public static Scanner in = new Scanner(System.in);
	public static int counter =0;
	
	public static void main(String [] args) 
	{
		
		//declare variables
		int x;
		int e=20,d=10,vd=5;
		int Guess;
		
			//print menu
			System.out.println("Welcome to Guess That Number!");
			System.out.println("\nChoose your level of difficulty:");
			System.out.println("1. Easy");
			System.out.println("2. Difficult");
			System.out.println("3. Very Difficult");
			
			//read user's input
			x=in.nextInt();
			
			//print instructions
			System.out.println("The computer will generate a number between 1 and 100. \nYou must guess the correct number to win.");
			
			//generate random number
			int random= 1 + (int)(Math.random() * ((100 - 1) + 1));
			
			//check user's input
			if(x==1)
			{
				do
				{
					//call method game
					Guess=guess(e, random);
					e--;
				}
				while(Guess<0 && e>0);
					
				if(Guess>0)
				{
					System.out.println("You won in "+Guess+" guesses! - The secret number is "+random);
				}
				else
				{
					System.out.println("You lost! - The secret number is "+random);
				}
			}
			else if(x==2)
			{
				
				do
				{
					//call method game
					Guess=guess(d, random);
					d--;
				}
				while(Guess<0 && d>0);
					
				if(Guess>0)
				{
					System.out.println("You won in "+Guess+" guesses! - The secret number is "+random);
				}
				else
				{
					System.out.println("You lost! - The secret number is "+random);
				}
				
			}
			else if (x==3)
			{	
				do
				{
					//call method game
					Guess=guess(vd, random);
					vd--;
				}
				while(Guess<0 && vd>0);
				
				if(Guess>0)
				{
					System.out.println("You won in "+Guess+" guesses! - The secret number is "+random);
				}
				else
				{
					System.out.println("You lost! - The secret number is "+random);
				}
			
			}
			else
			{
				System.out.println("Invalid choice!");
			}
			
			
	
	
	}
	
	public static int guess(int g, int random)
	{
		//declare variables
		int user;
		int guess = g;
		counter++;
		System.out.println("\nYou have "+guess+" chances to guess the secret number!");
				
		//read users input
		user=in.nextInt();
			
		//check if user followd instructions
		if(1<=user && user<=100)
			
			{
				//check if user entered the correct number
				if(user==random)
				{
					System.out.println("Winner!");
					return counter;
				}
				else if(user<random)
				{
					System.out.println("Guess is too small.");
					return -1;
				}
				else if(user>random)
				{
					System.out.println("Guess is too big.");
					return -1;
				}
				else
				{
					return -1;
				}
					
			}
	else{
			System.out.println("Invalid choice!");
			return -1;
		}
		
		
	}
}
