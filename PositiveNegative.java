
import java.util.Scanner;

public class PositiveNegative{
	public static void main(String args[])
		{
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = reader.nextInt();
			if(number > 0)
				{
					System.out.print("Entered number is positive");
				}
			else
				{
					System.out.println("Entered number is negative");
				}

		}

}
