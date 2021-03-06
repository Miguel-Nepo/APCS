//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		fileName = "";
	}

	public Histogram(char[] values, String fName)
	{
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		for (char i:values){
			letters.add(i);
			count.add(0);
		}
		fileName = fName;

		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNext()){
			String s = file.next();
			for (int i = 0;i<s.length();i++){	
				for (int j = 0;j<letters.size();j++){
					if (s.charAt(i)==letters.get(j)){
						count.set(j, count.get(j)+1);
					}
				}
			}
			
		}

	}

	public char mostFrequent()
	{
		int maxIndex = 0;
		int max = count.get(0);
		for (int i = 1;i<count.size();i++){
			if (count.get(i)>max){
				maxIndex = i;
				max = count.get(i);
			}
		}
		return letters.get(maxIndex);
	}

	public char leastFrequent()
	{
		int minIndex = 0;
		int min = count.get(0);
		for (int i = 1;i<count.size();i++){
			if (count.get(i)<min){
				minIndex = i;
				min = count.get(i);
			}
		}
		return letters.get(minIndex);

	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}