//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		out.print("Guessing Game - how many numbers? ");
		response = keyboard.nextInt();
		
		GuessingGame game1 = new GuessingGame(response);
		game1.playGame();




	}
}