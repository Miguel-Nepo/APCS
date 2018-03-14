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
import java.util.Collections;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		ArrayList<Student> studentList= new ArrayList<Student>();
	}
	
	public Class(String classname, int stuCount)
	{
		name = classname;
		ArrayList<Student> studentList= new ArrayList<Student>();;
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum,s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0;
		for (Student i:studentList){
			sum+=i.getAverage();
		}
		
		classAverage = sum/studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0.0;
		for (Student i:studentList){
			if (i.getName()==stuName){
				average = i.getAverage();
			}
		}
		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		Collections.sort(studentList);
		return studentList.get(studentList.size()-1).getName();
	}
		

	public String getStudentWithLowestAverage()
	{
		Collections.sort(studentList);
		return studentList.get(0).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (Student i:studentList){
			if (i.getAverage()<failingGrade){
				output+=i.getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (Student i: studentList){
			output += i.toString() + "\t" + i.getAverage() + "\n";
		}

		return output;
	}  	
}