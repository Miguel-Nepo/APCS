//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a character :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

		out.print("Enter a character :: ");
		char num = keyboard.next().charAt(0);
		CharacterAnalyzer test1 = new CharacterAnalyzer(num);
		out.println(test1);   //1
		
		out.print("Enter a character :: ");
		char lowletter = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(lowletter);
		out.println(test2);   //a
		//add more test cases
		
		
		
		
		
		
		
		

	}
}