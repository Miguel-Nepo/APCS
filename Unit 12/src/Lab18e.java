//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> m = new ArrayList<Word>();
		while (file.hasNextLine()){
			m.add(new Word(file.nextLine()));
		}
		System.out.println(m);
		for (int i = 0;i<m.size();i++){
			for (int j = 0;j<m.size()-1;j++){
				if (m.get(j).compareTo(m.get(j+1))==1){
					Word temp = m.get(j+1);
					m.set(j+1, m.get(j));
					m.set(j, temp);
				}
			}
		}
		System.out.println(m);




	}
}