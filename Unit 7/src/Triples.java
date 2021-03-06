//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i<=number;i++){
			if (a%i==0 && b%i==0 && c%i==0){
				max = i;
			}
		}
		if (max != 0 ){
			return max;
		}
		return 1;
	}

	public String toString()
	{
		String output="";
		for (int a=0;a<=number;a++){
			for (int b=0;b<=number;b++){
				for (int c=0;c<=number;c++){
					if (a<=b && b<c){
						if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
							if ((a%2 == 0 && b%2 == 1)||(a%2 == 1 && b%2 == 0)){
								if (greatestCommonFactor(a,b,c)==1){
									System.out.println( a + " " + b + " " + c);
								} 
							}
						}
					}
				}
			}
		}






		return output+"\n";
	}
}