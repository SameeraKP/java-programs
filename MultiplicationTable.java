//Program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("enter the number for which you want the multiplication table");
		int num = reader.nextInt();
		for (int i=1; i<12; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}


