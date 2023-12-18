import java.util.Scanner;
public class Swap
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("\nEnter the first number");
int first = reader.nextInt();
System.out.print("\nEnter the second number");
int second = reader.nextInt();
reader.close();
int temp = first;
first=second;
second=temp;
System.out.print("Swaped numbers are: First number = " + first + " Second number: " + second);
}
}