// Family name, Given name: Opolski Aniela

// Student number:7629248 
// Course: IT1 1120 
// Assignment Number 3

package a3_7629248;
import java.util.Scanner;

public class a3Q1_7629248 {

	public static void main(String [] args)
	{
		//initiate scanner and declare variables
		Scanner input= new Scanner(System.in);
		int x;
		int median;
		
		//prompt user for the amount of numbers they want to find the median of
		System.out.println("Please enter the amount of integers you would like to find the median of: ");
		
		//read the input
		x=input.nextInt();
		
		//create an array with x amount of spaces
		int[] numbers= new int[x];
		
		//prompt the user for the integers
		System.out.println("Please enter the integers");
		
		//load the integers into the array
		for(int y=0; y<x; y++)
		{
			numbers[y]=input.nextInt();
		}
		
		//call the method median
		median= Median(x, numbers);
		
		//print the median
		System.out.println("The median is "+median);
	}
	
	public static int Median( int x, int[]numbers)
	{
		
		int med=0;
		
		for(int i=0;i<x; i++ )
		{
			for(int j=0;j<x-1; j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			
			}
		
		}
		
		for(int y=0; y<x; y++)
		{
			System.out.print(" " + numbers[y]);
		}
		
		if(x%2==0)
		{
			med=numbers[(x/2)-1];
		}
		else
		{
			med=numbers[(int)(x/2)];
		}
		
		
		return med;
		
	}
	
}
