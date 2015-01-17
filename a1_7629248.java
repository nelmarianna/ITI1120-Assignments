// Family name, Given name: Opolski, Aniela

// Student number:7629248
// Course: IT1 1120
// Assignment Number 1


import java.util.Scanner;

public class a1_7629248 {

	public static Scanner keyboard;
	
	public static void main (String [ ] args)
	{		
		/*
		==================================================
		Question 1
		==================================================
		*/
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
		
		//create a variable of type double to store the temperature entered by the user
		double temp;
		
		//create a variable of type double to store the temperature in kelvin
		double newTemp;
		
		//prompt user to enter a temperature
		System.out.println("Please enter the current tempurature in degrees Fahrenheit: ");

		//read user input
		temp = keyboard.nextDouble();
		
		//algorithm for the conversion of Fahrenheit to Kelvin
		newTemp= ((temp-32.0)/1.8)+273.15;
		
		System.out.println("The current temperature is "+temp+" degrees Fahrenheit, that is (approximately)"+newTemp+ "Kelvin");
		
		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 2
		==================================================
		*/
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
		
		//create two variables of type double to hold pounds, ounces and kilograms
		double pounds, ounces, kg;
		
		//prompt user to enter values for the weight
		System.out.println("\nEnter two numbers for the weight (the first in pounds and the second in ounces)");
		
		//first read pounds
		pounds=keyboard.nextDouble();
		
		//next read ounces
		ounces=keyboard.nextDouble();
		
		//algorithm for changing pounds and ounces into kilograms
		
		double totalOunces;
		
		totalOunces=(pounds*16.0)+ounces;
		
		kg= totalOunces/35.274;
		
		//print the final answer
		System.out.println(pounds+ " pounds and "+ounces+" ounces is (approximately) "+kg+" kg.");
	
		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 3
		==================================================
		*/
		//declare new scanner 
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
		//declare variables of type string for the quote and person's name and int for the year
		String quote, person;
		int year;
		
		//prompt user for a quote
		System.out.println("Give me a quote:");
		//read the quote
		quote = keyboard.nextLine();
		
		//prompt user for the persons name
		System.out.println("Who said that?");
		
		//read the name
		person = keyboard.nextLine();
		
		//prompt user for the year
		System.out.println("What year did he say that?");
		
		//read the year
		year= keyboard.nextInt();
		
		//print the information
		System.out.println("===========================================================================================");
		System.out.println("In "+year+", a person called "+person+" said: \""+quote+"\"");
		System.out.println("*******************************************************************************************");
		
		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 4
		==================================================
		*/
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
				
		//declare variables of type int for the user number and sum of the n first numbers
		int n;
		int sum;
		
		//prompt user to enter an integer
		System.out.println("Enter a positive integer: ");
		
		//read the number
		n=keyboard.nextInt();
		
		//algorithm for the sum of the first n numbers
		sum=(n*(n+1))/2;
		
		//print the sum of the numbers
		System.out.println(sum);

		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 5
		==================================================
		*/
		
		//declare variables of type character for the three characters
		char one, two, three;
		
		//prompt the user for three characters and read each one
		System.out.println("Enter a character");
		one=ITI1120.readChar();
		
		System.out.println("Enter a second character");
		two=ITI1120.readChar();
		
		System.out.println("Enter a third character");
		three=ITI1120.readChar();
		
		//print the characters with the ASCII art 
		
		System.out.println("   ,d888888888b    d8888888888b.");
		System.out.println("  d888888888888b  d8888888888888b");
		System.out.println(" d88888888888888V8888888888888888b");
		System.out.println("88888888888888888888888888888888888");
		System.out.println("88888888888888888888888888888888888");
		System.out.println("88888888888888 "+one+" "+two+" "+three+" 88888888888888");
		System.out.println("88888888888888888888888888888888888");
		System.out.println(" 888888888888888888888888888888888");
		System.out.println("  8888888888888888888888888888888");
		System.out.println("   Y888888888888888888888888888Y");
		System.out.println("     Y88888888888888888888888Y");
		System.out.println("       Y8888888888888888888Y");
		System.out.println("         Y888888888888888Y");
		System.out.println("           Y88888888888Y");
		System.out.println("             Y8888888Y");
		System.out.println("               Y888Y");
		System.out.println("                 V");
		
		
		
		
		
		
		/*
		==================================================
		Question 6
		==================================================
		*/
		
		//declare a variable of type char and int for the character and new character
		char chr;
		int chrLower,chrUpper;
		
		
		//prompt the user to enter an uppercase letter
		System.out.println("Please enter an uppercase letter");
		
		//read user input
		chr=ITI1120.readChar();
		
		//change to lowercase
		chrUpper= (int)chr;
		chrLower=chrUpper+32;
		chr=(char)chrLower;
		
		//print answer
		System.out.println(chr);
				
	
	
		
		
		
		/*
		==================================================
		Question 7
		==================================================
		*/
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
		
		//declare variables of type double for x,and z of type int for y
		double x, z;
		int y;
		
		//prompt user to enter non-negative number 
		System.out.println("Please enter a non-negative number");
		
		//read the users input
		x=keyboard.nextDouble();
		
		//algorithm
		y=(int)x;
		z=(x-y)*12;
		
		//print the two variables
		System.out.println(y+","+z);
		
		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 8
		==================================================
		*/
		
		//create a scanner to read all user input
		keyboard = new Scanner(System.in);
		
		
		//declare variables of type boolean and type int
		boolean B;
		int a,b,c;
		
	    //prompt user for three integers
		System.out.println("Please enter three integers");
		
		//read the users input
		a=keyboard.nextInt();
		b=keyboard.nextInt();
		c=keyboard.nextInt();
		
		//algorithm
		B= (a <= b && a >= c)||  (a >= b && a <= c);
		System.out.println(a+" is a median: "+B);
		
		B= (b <= a && b >= c)||  (b >= a && b <= c);
		System.out.println(b+" is a median: "+B);
		
		B= (c <= a && c >= b)||  (c >= a && c <= b);
		System.out.println(c+" is a median: "+B);
		
		
		
	
		
		/*
		==================================================
		Question 9
		==================================================
		*/
		
		//create a scanner to read all user input
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables of type int, double and boolean
		int i,j,q,r;
		double k;
		boolean boo;
		
	    //prompt user for the coordinate
		System.out.println("Please enter a coordinate point for the bottom left corner of a square");
		
		//read the users input
		i=keyboard.nextInt();
		j=keyboard.nextInt();
		
		//prompt user for the length of the square
		System.out.println("Please enter a length for your square");
		
		//read users input
		k=keyboard.nextDouble();
		
		 //prompt user for the query coordinate
		System.out.println("Please enter coordinates of a query point");
		
		//read the users input
		q=keyboard.nextInt();
		r=keyboard.nextInt();
		
		//algorithm
		boo= i<=q && (i+k)>=q && j<=r && (j+k)>=r;
		
		//print the answer
		System.out.println("The coordinate "+q+","+r+" is in the square: "+boo);
		
		//close scanner
		keyboard.close();
		
		
		
		
		
		/*
		==================================================
		Question 10
		==================================================
		*/
		
		//declare scanner keyboard
		keyboard = new Scanner(System.in);
				
		//declare variables of type int and double
		int quarters, dimes, nickels, pennies, total;		
		double change, pen;
				
		//prompt user for the amount of change
		System.out.println("Please enter the amount you are owed in $: ");
				
		//read the amount
		change= keyboard.nextDouble();
				
		//algorithm
		quarters=(int)(change/0.25);
		change= (change%0.25);
				
		dimes=(int)(change/0.1);
		change=change%0.1;
				
		nickels=(int)(change/0.05);
		change= change%0.05;
				
		pen= (change/0.01);
		change= change%0.01;
		System.out.println(pen+""+change);
			
		pennies= (int)(pen + change);
			
		total= quarters+dimes+nickels+pennies;
				
		//print the final total of coins
		System.out.println(total);			
		//close keyboard
		keyboard.close();
	}
}
