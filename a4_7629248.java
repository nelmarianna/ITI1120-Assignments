// Family name, Given name: Opolski, Aniela
// Student number:7629248 
// Course: IT1 1120 
// Assignment Number 4

import java.util.Scanner;

import java.io.IOException;

public class a4_7629248{

	// main method. DO NOT MODIFY
	public static void main(String args[]) {
		Scanner keyboard = new Scanner( System.in );

		System.out.println("Welcome to Memory Game");

		int board_side;

		//this loop obtains the board size, or more specifically 
		// the length of the side of the board
		do{
			System.out.println("\n For 2x2 board game press 2"+
					"\n For 4x4 board game press 4"+
					"\n For 6x6 board game press 6");
			board_side=keyboard.nextInt();
		}
		while(board_side!=2 && board_side!=4 && board_side!=6);

		char[][] board = createBoard(board_side);

		// a call the the shuffle method
		shuffleBoard(board);

		// a call to the game playing method
		playGame(board); 

	}


	
	
	/**************************************************************************
	     
	                         shuffleBoard method
	       
	**************************************************************************/
	

	// The following method should shuffle the input 2D array called board 
	public static char[][] shuffleBoard(char[][] board)
	{

		//finds the amount of variables in the board array
		int N = board.length*board.length;
		
		// This creates a 1D array whose size is equal to the size of the board   
		char[] board1D = new char[N];

		// Copy the elements of 2D array into that 1D array here
		int z=0;
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board.length; y++)
			{
				board1D[z]= board[x][y]; 
				z++;
			}
		}

		// Shuffle 1D array here 
		for(int i=0; i<board.length; i++)
		{
			//generate a random index
			int index= (int)(Math.random() * N);
			char temp=board1D[i];
			board1D[i]=board1D[index];
			board1D[index]= temp;

		}


		//Copy shuffled 1D array back into 2D array, i.e., back to the board
		z=0;
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board.length; y++)
			{
				board[x][y]=board1D[z];
				z++;
			}
		} 
		
		//return the shuffled board to the main method
		return board;

	} 


	/**************************************************************************
    
    							playGame method

	 **************************************************************************/
	
	
	
	//a game playing method 
	public static void playGame(char[][] board)
	{
		Scanner keyboard = new Scanner( System.in );
		//variables of type int to hold coordinate points
		int x1,x2,y1,y2;
		
		//variable of type int to count the amount of pairs found
		int counter=0;

		// this creates a 2D array indicating what locations are paired, i.e., discovered
		// at the beginning none are, so default initialization to false is okay
		boolean[][]discovered=new boolean[board.length][board[0].length]; 
		
		//create boolean 2D array indicating which locations are being looked at
		boolean[][]lookAt=new boolean[board.length][board[0].length]; 
		
		//boolean variable to test if inputs are correct
		boolean check =true;
		
		//create boolean variable to test if game is over
		boolean isGameOver = false;

		
		//while loop tests if game is over before repeating game
		while (!isGameOver)
		{
			
			//call the printBoard method
			printBoard(board, lookAt, discovered);

			//do while loop to test inputs for first coordinate
			do{
				//ask for user input
				System.out.println("\nEnter a pair of undiscovered distinct locations on the board that you want revealed \n.i.e., a pair of integers in the range [1,"+board.length+"]");

				

				//read use input
				x1=keyboard.nextInt();
				y1=keyboard.nextInt();

				//reset check to true
				check =true;
				
				//check if input is valid; if invalid print invalid and set check to false
				if(0 > x1-1 || x1-1>board.length-1 || 0>y1-1 || (y1-1)>board.length-1)  
				{
					
					System.out.println("incorrect input");
					check=false;
				}
				//check if this coordinate has already been paired; if so set check to false
				else if(discovered[x1-1][y1-1]==true)
				{
					System.out.println("pair at this coordinate has already been found");
					check=false;
				}


			}
			//while check is false redo the loop; if true end the loop
			while(check==false);


			//do while loop to test inputs for second coordinate
			do
			{
				//ask for user input
				System.out.println("Enter the second pair: ");

				//read user input
				x2= keyboard.nextInt();
				y2= keyboard.nextInt();
				
				//reset check to true
				check =true;
				
				//check if valid; if not set check to false
				if(0 >x2-1 || x2-1>board.length-1 || 0>y2-1 || y2-1>board.length-1)  
				{
					System.out.println("\nincorrect input");
					check=false;
				}
				//check if this coordinate has already been paired; if so set check to false
				else if(discovered[x2-1][y2-1]==true )
				{
					System.out.println("Pair at this coordinate has already been found");
					check=false;
				}
				//check if the coordinate is the same as the previous; if so, set check to false
				else if(x1==x2 && y1==y2)
				{
					System.out.println("You have already enetered this, please enter a different coordinate ");
					check=false;
				}

			}
			//while check is false repeat loop, if not end loop
			while(check==false);



			//check if the two coordinates are the same letter
			if(board[x1-1][y1-1]==board[x2-1][y2-1])
			{
				//set discovered coordinates to true to show up on the board
				discovered[x1-1][y1-1]=true;
				discovered[x2-1][y2-1]=true;
				
				//add one discovered coordinate to te counter
				counter++;
			}

			//set the look at coordinates to true to show up on the board
			lookAt[x1-1][y1-1]=true;
			lookAt[x2-1][y2-1]=true;

			//print board with discovered pairs and pairs to look at
			printBoard(board, discovered, lookAt);

			//check if the counter has reached the maximum amount of pairs, if so, set isGameOver to true
			if(counter==(board.length*board.length)/2)
			{
				isGameOver=true;
			}

			//Check if game is not over
			if(!isGameOver)
			{

				//call method waitForPlayer
				waitForPlayer();

				//loop to clear page
				for(int a=0; a<30; a++)
				{
					//clear page
					System.out.println("");

					//clear the board from previous unpaired attempts
					lookAt[x1-1][y1-1]=false;
					lookAt[x2-1][y2-1]=false;
				}
			}
			
			//if game is over, congratulate the player
			else
			{
				System.out.println("Congratulations! You Won!");

			}

		}

	}

	
	
	
	/**************************************************************************
    
    						 createBoard method

	 **************************************************************************/

	// createBoard method. DO NOT MODIFY!
	/* this method, createBoard, creates the board filled with letters of alphabet, 
	  where each letter appears exactly 2 times
	  e.g., for 4 x 4, the returned board would look like:
	  A B C D 
	  E F G H
	  A B C D 
	  E F G H */    
	public static char[][] createBoard(int side) 
	{
		char[][] tmp = new char[side][side];
		int letter_count=0;
		for (int row = 0; row < tmp.length/2; row++){
			for(int col = 0; col < tmp[row].length; col++)
			{
				tmp[row][col]=(char)('A'+letter_count);
				tmp[row+tmp.length/2 ][col]=tmp[row][col];
				letter_count++;
			}
		}
		return tmp;
	}


	
	
	/**************************************************************************
    
    						    waitForPlayer method

	 **************************************************************************/
	
	
	// waitForPlayer method. Do not modify! 
	public static void waitForPlayer()
	{
		System.out.print("Press enter to continue");
		try {

			System.in.read();

		}
		catch (IOException e){
			System.out.println("Error reading from user");
		}
	}

	
	
	
	/**************************************************************************
    
    							printBoard method

	 **************************************************************************/

	public static void printBoard(char[][]board, boolean[][]discovered,boolean[][]lookAt)
	{
		//print board 
		for(int i=0; i<board.length; i++)
		{ 
			//print numbers along the left column
			System.out.print(i+1+" ");

			
			for(int j=0; j<board.length; j++)
			{
				//check if user has guessed this spot if not print a star
				if(discovered[i][j]==false && lookAt[i][j]==false)
				{
					System.out.print("* ");
				}
				//else print board
				else
				{
					System.out.print(board[i][j]+" ");
				}

			}
			//jump to new line
			System.out.println("");
		}
		//add a space
		System.out.print("  ");

		//loop to print numbers along bottom row
		for(int i=0; i<board.length; i++)
		{ 
			System.out.print(i+1+" ");
		}
		//set new line
		System.out.println("\n");

		//return to playGame method
		return;
	}
}




