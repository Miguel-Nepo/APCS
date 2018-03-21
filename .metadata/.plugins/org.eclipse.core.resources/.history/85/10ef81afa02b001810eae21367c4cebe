//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;







		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		String w = rhs.toString();
		int WvowelCount = 0;
		for (int i = 0; i<w.length();i++){
			if (w.charAt(i)=='a'||w.charAt(i)=='e'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='u'){
				WvowelCount++;
			}
		}
		int WordVowelCount = 0;
		for (int j = 0;j<word.length();j++){
			if (word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'){
				WordVowelCount++;
			}
		}
		if (WordVowelCount>WvowelCount){
			return 1;
		}
		else if (WordVowelCount<WvowelCount){
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
	
		return -1;
		}
	}

	public String toString()
	{
		return word;
	}
}