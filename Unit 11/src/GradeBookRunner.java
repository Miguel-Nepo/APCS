//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		ArrayList<Class> classes = new ArrayList<Class>();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many classes are there? ");
		int classnum = keyboard.nextInt();
		keyboard.nextLine();
		
		for (int j = 0; j<classnum;j++){
			System.out.println("What is the name of this class? ");
			String name = keyboard.nextLine();
			
			System.out.println("How many students are in this class? ");
			int classSize = keyboard.nextInt();
			keyboard.nextLine();
			
			Class test = new Class(name,classSize);
			
			for (int i = 0;i<classSize;i++){
				System.out.println("Enter the name of student "+(i+1));
				String stuName = keyboard.nextLine();
				
				System.out.println("Enter the grades of "+stuName);
				System.out.println("Use the format x - grades ( 2 - 100 100) : ");
				String stuGrades = keyboard.nextLine();
			
				test.addStudent(i,new Student(stuName,stuGrades));
			}
			out.println(test);
			
			out.println("Failure List = " + test.getFailureList(70));	
			out.println("Highest Average = " + test.getStudentWithHighestAverage());
			out.println("Lowest Average = " + test.getStudentWithLowestAverage());
									
			out.println(String.format("Class Average = %.2f",test.getClassAverage()));	

		}
		
	}		
}