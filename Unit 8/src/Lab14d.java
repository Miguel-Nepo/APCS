import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many grades? ");
		int number = keyboard.nextInt();
		Grades gradebook1 = new Grades(number);
		System.out.print(gradebook1);
		
		
	}
}