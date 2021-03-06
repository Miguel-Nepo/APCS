//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		String w = rhs.toString();
		
		if (word.length()>w.length()){
			return 1;
		}
		else if (word.length()<w.length()){
			return -1;
		}
		else {
			for (int k = 0;k<word.length();k++){
				if ((int)word.charAt(k) < (int)w.charAt(k)){
					return -1;
				}
				else if ((int)word.charAt(k) > (int)w.charAt(k)){
					return 1;
				}
				
			}
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}