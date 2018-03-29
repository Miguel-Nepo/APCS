//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner s = new Scanner(new File("lab15d.dat"));
		int size = s.nextInt();
		s.nextLine();
		for (int i = 0; i<size;i++){
			String next = s.nextLine();
			FancyWords test = new FancyWords(next);
			System.out.println(test);
		}





	}
}