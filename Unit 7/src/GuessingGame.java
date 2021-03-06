//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		int counter = 0;
		double randomnum = Math.ceil(Math.random()*upperBound);
		
		out.print("Enter a number between 1 and " + upperBound + " ");
		int guess = keyboard.nextInt();
		if (guess > upperBound){
			System.out.println("Number out of range!");
		}
		else
			counter++;
		
		while (guess != randomnum){
			out.print("Enter a number between 1 and " + upperBound + " ");
			guess = keyboard.nextInt();
			if (guess > upperBound){
				System.out.println("Number out of range!");
			}
			else
				counter++;
		}
		
		double percentage = (1-(1/(double)counter))*100;
		
		System.out.println("\nIt took "+ counter + " guesses to guess "+ randomnum);
		if (percentage == 0){
			System.out.println("You played a perfect game. Congratulations!!");
		}
		else{
			System.out.println("You guessed wrong " + percentage + " percent of the time.");
		}
		
		
		




	}

	public String toString()
	{
		String output="";
		return output;
	}
}