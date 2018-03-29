//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int n = number;
		while (n>0){
			count++;
			n /= 10;

		}
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for (int i = 0;i<sorted.length;i++){
			sorted[i] = number%10;
			number /= 10;
		}
		for (int j = 0; j < sorted.length; j++){
		for (int i = 0; i<sorted.length-1;i++){
			if (sorted[i] > sorted[i+1]){
				int temp = sorted[i+1];
				sorted[i+1] = sorted[i];
				sorted[i] = temp;
			}
		}
		}
		
		
		
		
		return sorted;
	}
}