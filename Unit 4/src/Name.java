//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private String firstName;
	private String lastName;
	
	public Name()
	{
		setName("");
	}

	public Name(String s)
	{
		setName(s);
	}

    public void setName(String s)
    {
	   name = s;
    }

	public String getFirst()
	{
		firstName = name.substring(0, name.indexOf(" ")); 
		return firstName;
	}

	public String getLast()
	{
		lastName = name.substring(name.indexOf(" ")+1,name.length()); 
		return lastName;
	}

 	public String toString()
 	{
 		return name;
 		
	}
}