//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Double> grades = new ArrayList<Double>();
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{	
		Scanner s = new Scanner(gradeList);
		int howMany = 0;
		if (s.hasNextInt()){
			howMany = s.nextInt();

		}
		if (s.hasNext()){
			s.next();
		}
		for (int i = 0;i<howMany;i++){
			grades.add(s.nextDouble());
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.add(spot,grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (double i:grades){
			sum+=i;
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (double i:grades){
			if (i<low){
				low=i;
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (double i:grades){
			if (i>high){
				high = i;
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (double i:grades){
			output += i + " ";
		}

		return output;
	}	
}