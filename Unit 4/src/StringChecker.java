//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		setString("");

	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		for (int i=0;i < word.length();i++){
			if (word.charAt(i)==c){
				return true;
			}
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		
		int index = -1;
		index = word.indexOf(s);
		if (index != -1){
			return true;
		}

		return false;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}