import java.util.Scanner;

public class AlphabetCharacter
{
    public static void main(String args[])
    {
       Scanner reader = new Scanner(System.in);
       System.out.print("\nenter a character: ");
       char ch = reader.next().charAt(0);
       if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
	{
	     System.out.print("\nIt is an alphabet");
	}
       else
       {
             System.out.print("\nIt is not an alphabet");
       }
    }
}