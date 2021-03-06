//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));

		String name = file.nextLine();
		int classSize = file.nextInt();	
		file.nextLine();
		Class test = new Class(name,classSize);
		
		for (int i = 0;i<classSize;i++){
			String stuName = file.nextLine();
			String stuGrades = file.nextLine();
		
			test.addStudent(i,new Student(stuName,stuGrades));
		}
		out.println(test);
		
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));












	}		
}