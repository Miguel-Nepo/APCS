//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("a",'a');
	}

	public LetterRemover(String input,char remove)
	{
		setRemover(input, remove);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = sentence.indexOf(lookFor);
		while (cleaned.contains("" + lookFor)) {
			cleaned = sentence.substring(0, loc)+sentence.substring(loc+1,sentence.length());
			loc = sentence.indexOf(lookFor);
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}