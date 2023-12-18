import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter a number");
int num = reader.nextInt();
int numcopy=num;
int reversenum=0;
while(num>0)
{
reversenum = reversenum*10 + num%10;
num=num/10;
}
if(reversenum == numcopy)
{
System.out.print("\nIt is a palindrome number");
}
else
{
System.out.print("\nIt is not a palindrome number");
}
}
}
