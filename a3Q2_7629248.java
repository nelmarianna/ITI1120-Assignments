package a3_7629248;

// Family name, Given name: Opolski Aniela

// Student number:7629248 
// Course: IT1 1120 
// Assignment Number 3

import java.util.Scanner;

public class a3Q2_7629248 
{
	
 public static void main(String[] args) 
 { 
    
	 // part (a) of the main
  
	 Scanner keyboard = new Scanner(System.in); 
	 
	 System.out.println("***************************");
	 System.out.println("        Part (a)");
	 System.out.println("***************************");
  
  do
  {
	  System.out.println("Enter a word and then press enter:");
	  String str=keyboard.next();
	  char[] word = str.toCharArray();
  
   isSquareFree(word);
   
   System.out.println("Do you want to test another word? Press y for yes, or another key for no");
   
  }
  
  while(keyboard.next().charAt(0)=='y');
 
  // part (b) of the main
  /*
  System.out.println();
  System.out.println("***************************");
  System.out.println("        Part (b)");
  System.out.println("***************************");
  
  System.out.println("How long a square free word on letters a, b and c do you want?");
  System.out.println("Enter an integer greater than zero");
  int word_length=keyboard.nextInt();
  
  char[] square_free_word = makeSquareFree(word_length);
     
  System.out.println("Here is a square-free word of length "+ word_length);

  for(int i=0; i<word_length; i++)
  {
	  System.out.print(square_free_word[i]);
  }
  
  System.out.println();
  
  */
  /* by uncommenting the method call below, you can call isSquareFree with your created word 
   to verify that indeed it is square free */
  
  // isSquareFree(square_free_word);
  
  /* uncomment the method call below if you want to test if you solution 
   for part b is correct for n=1000. To use it, type in 1000 for the length when prompted by the program, 
   the method below will tell you if the word you created is indeed a correct word of length 1000 as per Thue procedure. */
  
  // test(square_free_word);
 }
  
 public static void isSquareFree(char[] word)
 {
  // YOUR CODE FOR PART (a) GOES HERE:
	
	 //create a boolean for square free or not
	 boolean square=false;
	 int x=0;
	 int n=0;
	 
	 //integer i starts at 0 used to loop through the characters 0-word.length-1
	 for( int i=0; i <=word.length-1; i++)
	 {
		 //integer j starts at 1 used to loop through the characters 1-word.length-2
		for(int j=i+1; j<=word.length-1; j++)
		{
			//check first condition. begin comparing i=j and loop through the j's to find he same characters
			//if i!= j then i is now 1 and the loop begins again
			if(word[i]==word[j])
			{	
				
				//once i==j then make a variable h to loop through the characters in between i and j
				int h=1;
				//make sure h is no larger than j-i, and j+h is not greater than the word length
				while( h<=j-i && j+h<word.length)
				{
					//check each letter after i and j to see if they match
					if(word[i+h]==word[j+h])
					{
						//if the jth char is the same as the i+h+1 then the word is not square free
						if(word[i+h+1]==word[j] )
						{
							if(h==(j-i-1))
							{

								square=true;
								x=i;
								n=j-1;
							}
						}
					}
					//if the letters after i and j dont match check if i and j match and if the are right after each other 
					else if(word[i]==word[j] && (j-i)==1)
					{
						square=true;
						x=i;
						n=j-1;
					}
					else
					{
						break;
					}
					h++;
				}
			}
		}
	 }
	 
	 
	
	 if(square==true)
	 {
		 System.out.print(" The subword ");
		 
		 for(int p=x; p<=n; p++)
		 {
			 System.out.print(word[p]);
		 }
		 
		 System.out.print(" is repeated at position "+(x+1));
		 System.out.println(" Therefore word is not square-free");
	 }
	 else if(square==false)
	 {
		 System.out.println("The word is square-free");
	 }
 }  
  
  
 // a method the produces a square free word of length n based on Thue's construction 
 public static char[] makeSquareFree(int n)
 {
    
	 char[] sfword= new char[n];
  
	 // YOUR CODE FOR PART (b) GOES HERE:
 
	 char[]a={'a','b','c','a','b'};
	 char[]b={'a','c','a','b','c','b'};
	 char[]c={'a','c','b','c','a','c','b'};
	 
	 //initialize variable for counter
	 int counter=0;
	 
	//set sfword 0 to 'a'
	sfword[0]='a';
	
	//create temporary arrays for a b and c
	char[]tempa = new char[5];
	char[]tempb = new char[6];
	char[]tempc = new char[7];
	
	//while loop to loop the counter make sure that it is less than n
	while(counter<n)
	{
		for(int y=0; y<=counter; y++)
		{
			//check if a b or c
		if(sfword[counter]=='a')
		{
			//if n is less than the length of array a loop through so that temp = n elements
			if(n<=a.length)
			{
				for(int i=0; i<n; i++)
				{
					tempa[i]=a[i];
					System.out.println(tempa[i]);
				}
			}
			//if n is greater than the length of array a loop through so that temp = a.length elements
			else if(n>a.length)
			{
				for(int i=0; i<a.length; i++)
				{
					tempa[i]=a[i];
					System.out.println(tempa[i]);
				}
			}
			
			for(int i=0; i<a.length; i++)
			{
				sfword[i]=tempa[i];
				
			}
			counter++;	
		}
		
		else if(sfword[counter]=='b')
		{

			//if n is less than the length of array b loop through so that temp = n elements
			if(n<b.length+a.length)
			{
				for(int i=0; i<n; i++)
				{
					tempb[i]=b[i];
					System.out.print(tempb[i]);
				}
			}

			//if n is greater than the length of array b and a loop through so that temp = b.length elements
			if(n>a.length+b.length)
			{
				
					for(int i=a.length; i<n-a.length; i++)
					{
						while(n-a.length <=b.length)
						{
						for(int j=0; j<b.length; j++)
						{
							tempb[i]=b[i];
							System.out.println(tempb[i]);
						}
					}
				}
			}
			counter++;
		}
		else if(sfword[counter]=='c')
		{
			//if n is less than the length of array b loop through so that temp = n elements
			if(n<b.length+a.length+c.length)
			{
				for(int i=0; i<n; i++)
				{
					tempc[i]=c[i];
					System.out.println(tempc[i]);
				}
			}

			//if n is greater than the length of array b and a loop through so that temp = b.length elements
			if(n>a.length+b.length+c.length)
			{
				
					for(int i=a.length+b.length; i<n-a.length-b.length; i++)
					{
						while(n-a.length-b.length <=c.length)
						{
						for(int j=0; j<c.length; j++)
						{
							tempc[i]=c[i];
							System.out.println(tempc[i]);
						}
					}
				}
			}
			counter++;
		}
		}
		if(counter>0)
		{
			counter=0;
		}
	}
	
	
	for(int x=0; x<a.length; x++)
	{
		sfword[x]=tempa[x];
	}
	for(int x=a.length;x<a.length+b.length; x++)
	{
		for(int i=0; i<b.length; i++)
		{
			sfword[x]=tempb[i];
		}
	}
	for(int x=a.length+b.length;x<a.length+b.length+c.length; x++)
	{
		for(int i=0; i<c.length; i++)
		{
			sfword[x]=tempc[i];
		}
	}
	
	
	
	
		
	
	
	
	
	
	return sfword;	 
 }
 
 // a method that tests if a given word of length 1000, is a square-free produced as per Thue's construction 
 public static void test (char[] your_sfword){

  if(your_sfword.length != 1000){
   System.out.println("This method only tests if part (b) correctly generates a word of length 1000."+
    "\n Enter 1000 the next time if you want to use this method");
   return;
  }
  
  String s1 = new String(your_sfword);
  String s2 ="abcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabcbabcabacabcbacbcacbabcabacabcbabcabacbcacbabcabacabcbacbcacbacabcbabcabacbcacbacabcbacbcacbabcabacbcacbacabc";
  if(s1.equals(s2)){
   System.out.println("Your Thue-procedure-based square-free word of length 1000 is correct.");
  }
  else {
   System.out.println("Your Thue-procedure-based square-free word of length 1000 is not correct.");
  }
  
 }
 
}