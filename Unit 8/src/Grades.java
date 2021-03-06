//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class Grades
{
	int howMany;
	ArrayList<Double> grades = new ArrayList<Double>();

	public Grades(){
		setGrades(1);
	}

	public Grades(int num){
		setGrades(num);
	}

	public void setGrades(int num){
		howMany = num;
	}

	private double getSum()
	{
		Scanner keyboard = new Scanner(System.in);
		double sum=0.0;
		int counter = 1;
		
		while (counter <= howMany){
			System.out.println("Grade " + counter + " :: ");
			double grade = keyboard.nextDouble();
			grades.add(grade);
			counter++;
		}
		
		for (int i=0;i<howMany;i++){
			sum += grades.get(i);
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / howMany;
		return average;
	}


	public String toString(){
		String output = "";
		output = "average = " +getAverage();
		return output;
	}



}