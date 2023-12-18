import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("\nenter the no of terms of the series");
int num = reader.nextInt();
int term1=0;
int term2=1;
int temp=0;
for(int i=1;i<=num;i++)
{
System.out.print("\t" + term1);
temp=term1+term2;
term1=term2;
term2=temp;
}
}
}
