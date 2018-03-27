//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int counter = 0;
		for (int i = 0;i<3;i++){
			for (int j = 0;j<3;j++){
				mat[i][j] = game.charAt(counter);
				counter++;
			}
		}
	}

	public String getWinner()
	{
		











		return "";
	}

	public String toString()
	{
		String output="";
		for (int i = 0;i<3;i++){
			for (int j = 0;j<3;j++){
				output += mat[i][j] + " ";
			}
			output += "\n";
		}


		return output+"\n\n";
	}
}