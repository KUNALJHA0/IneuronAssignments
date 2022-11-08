package Assignment;
import java.util.*;
//Updates :- In the result I added how much close or far the value player choose from the guessed number 
// Second Update :- Now we can play game multiple times , If user select 1 then they can continue playing and if user select 0 then it will over the game.
//Third Update :- In  the view of game
class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int player1DifferenceFromGuesser;
	int player2DifferenceFromGuesser;
	int player3DifferenceFromGuesser;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
		
	}
	void closestPlayer() {
	 player1DifferenceFromGuesser=numFromGuesser-numFromPlayer1;
	 player2DifferenceFromGuesser=numFromGuesser-numFromPlayer2;
	 player3DifferenceFromGuesser=numFromGuesser-numFromPlayer3;
  }
	
	
	
	void result()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
	
	
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				//System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				//System.out.println("Player 1 & Player2 won");
				if(player3DifferenceFromGuesser>=0)
				System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" less from correct number ");
				else {
					player3DifferenceFromGuesser=-player3DifferenceFromGuesser;
					System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" more from correct number ");
					
				}
					
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
				if(player2DifferenceFromGuesser>=0)
					System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" less from correct number ");
					else {
						player2DifferenceFromGuesser=-player2DifferenceFromGuesser;
						System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" more from correct number ");
						
					}
			}
			else
			{
			//System.out.println("Player 1 won the game");
			if(player3DifferenceFromGuesser>=0)
				System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" less from correct number ");
				else {
					player3DifferenceFromGuesser=-player3DifferenceFromGuesser;
					System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" more from correct number ");
					
				}
			if(player2DifferenceFromGuesser>=0)
				System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" less from correct number ");
				else {
					player2DifferenceFromGuesser=-player2DifferenceFromGuesser;
					System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" more from correct number ");
					
				}
			
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
				
				if(player1DifferenceFromGuesser>=0)
					System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" less from correct number ");
					else {
						player1DifferenceFromGuesser=-player1DifferenceFromGuesser;
						System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" more from correct number ");
						
					}
				
			}
			else
			{
			//System.out.println("Player 2 won the game");
			
			if(player1DifferenceFromGuesser>=0)
				System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" less from correct number ");
				else {
					player1DifferenceFromGuesser=-player1DifferenceFromGuesser;
					System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" more from correct number ");
					
				}
			
			if(player3DifferenceFromGuesser>=0)
				System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" less from correct number ");
				else {
					player3DifferenceFromGuesser=-player3DifferenceFromGuesser;
					System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" more from correct number ");
					
				}
			
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			//System.out.println("Player 3 won the game");
			if(player1DifferenceFromGuesser>=0)
				System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" less from correct number ");
				else {
					player1DifferenceFromGuesser=-player1DifferenceFromGuesser;
					System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" more from correct number ");
					
				}
			if(player2DifferenceFromGuesser>=0)
				System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" less from correct number ");
				else {
					player2DifferenceFromGuesser=-player2DifferenceFromGuesser;
					System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" more from correct number ");
					
				}
			
		}
		else
		{
			//System.out.println("Game lost Try Again!");
			
			if(player1DifferenceFromGuesser>=0)
				System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" less from correct number ");
				else {
					player1DifferenceFromGuesser=-player1DifferenceFromGuesser;
					System.out.println("Player 1 guess was "+player1DifferenceFromGuesser+" more from correct number ");
					
				}
			if(player2DifferenceFromGuesser>=0)
				System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" less from correct number ");
				else {
					player2DifferenceFromGuesser=-player2DifferenceFromGuesser;
					System.out.println("Player 2 guess was "+player2DifferenceFromGuesser+" more from correct number ");
					
				}
			if(player3DifferenceFromGuesser>=0)
				System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" less from correct number ");
				else {
					player3DifferenceFromGuesser=-player3DifferenceFromGuesser;
					System.out.println("Player 3 guess was "+player3DifferenceFromGuesser+" more from correct number ");
					
				}
			
		}
		
	}
	
	
		
	
}


public class LaunchGame {

	public static void main(String[] args) {
		System.out.println("___---GUESSER GAME---___");
		System.out.println("___-------------------------------------------------------------------___");
		System.out.println("___-------------------------------------------------------------------___");
		System.out.println("___-------------------------------------------------------------------___");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);	
		Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.closestPlayer();
			System.out.println("___---Results----___");
			System.out.println("___----------------------------------------------------------------___");
			System.out.println("___----------------------------------------------------------------___");
			System.out.println("___----------------------------------------------------------------___");
			u.result();
			int wantToKnowTheDifference;
			
			
			System.out.println("Did You Want To know the difference OR  Did You Want To Play Again?");
			System.out.println("Enter 1 for Yes OR 0 for No");
			wantToKnowTheDifference=scan.nextInt();
			if(wantToKnowTheDifference==1)u.compare();
			//Scanner scan=new Scanner(System.in);
			int wantToPlayAgain;
			System.out.println("___-------------------------------------------------------------------___");
			System.out.println("___-------------------------------------------------------------------___");
			System.out.println("___-------------------------------------------------------------------___");
			System.out.println("Did You Want To Play Again?");
			System.out.println("Enter 1 for Yes OR 0 for No");
			wantToPlayAgain=scan.nextInt();
			
			while(wantToPlayAgain==1) {
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.closestPlayer();
				u.result();
				int wantToKnowTheDifferencee;
				
				
				System.out.println("Did You Want To know the difference OR  Did You Want To Play Again?");
				System.out.println("Enter 1 for Yes OR 0 for No");
				wantToKnowTheDifferencee=scan.nextInt();
				if(wantToKnowTheDifferencee==1)u.compare();
				
				int count;
				System.out.println("___---------------------------------------------------------------___");
				System.out.println("___---------------------------------------------------------------___");
				System.out.println("___---------------------------------------------------------------___");
				System.out.println("Did You Want To Play Again?");
				System.out.println("Enter 1 for Yes OR 0 for No");
				count=scan.nextInt();
				if(count==0) {
					
					System.out.println("___-----------------------------------------------------------___");
					System.out.println("___-----------------------------------------------------------___");
					System.out.println("___-----------------------------------------------------------___");
					System.out.println("___Thank You For Playing!!!___");
					break;
					}
				
			}
		   if(wantToPlayAgain==0) {
			   System.out.println("___------___");
			   System.out.println("___------___");
			   System.out.println("___------___");
			   System.out.println("___Thank You For Playing!!!___");
			}
			

	}

}
