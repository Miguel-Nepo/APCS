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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String sentence = "";
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()){
				//sentence+=file.nextLine();
				String test = file.next();
				if (test.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				else if (test.equals("@")){
					out.print(getRandomVerb() + " ");
				}
				else if (test.equals("&")){
					out.print(getRandomAdjective() + " ");
				}
				else{
					out.print(test + " ");
				}
			
			}
		

		
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

	public void loadNouns()
	{
		try{
		Scanner file = new Scanner(new File("nouns.dat"));
		while(file.hasNextLine()){
			nouns.add(file.nextLine());
		}
	
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
		Scanner file = new Scanner(new File("verbs.dat"));
		while(file.hasNextLine()){
			verbs.add(file.nextLine());
		}
		
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
		Scanner file = new Scanner(new File("adjectives.dat"));
		while(file.hasNextLine()){
			adjectives.add(file.nextLine());
		}
		

		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		//String verb = verbs[((int)Math.random())*(verbs.length-1)];
		String verb =  verbs.get((int)((Math.random())*(verbs.size())));
		return verb;
	}
	
	public String getRandomNoun()
	{
		String noun =  nouns.get((int)((Math.random())*(nouns.size())));
		return noun;
	}
	
	public String getRandomAdjective()
	{
		String adjective = adjectives.get((int)((Math.random())*(adjectives.size())));
		return adjective;
	}		

	public String toString()
	{
		/*int r = sentence.length();
		
		String s = sentence;
		for (int i = 0; i<r;i++){
		
			if (sentence.charAt(i)=='#'){
				s = s.substring(0, i)+getRandomNoun()+s.substring(i+1);
				
			}
			else if(sentence.charAt(i)=='@'){
				s = s.substring(0, i)+getRandomVerb()+s.substring(i+1);
				
			}
			else if(sentence.charAt(i)=='&'){
				s = s.substring(0, i)+getRandomAdjective()+s.substring(i+1);
							
			}
		}*/
		String s = "";
	    return s;
	}
}