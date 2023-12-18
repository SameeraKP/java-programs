import java.util.Scanner;
public class GreatestThree
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter three numbers");
System.out.print("Enter 1st number");
int n1 = reader.nextInt();
System.out.print("Enter 2nd number");
int n2 = reader.nextInt();
System.out.print("Enter 3rd number");
int n3 = reader.nextInt();
reader.close();
if(n1>n2)
{
if(n1>n3)
{
System.out.print("Greatest among the three numbers is" +n1);
}
else
{
System.out.print("Greatest among the three numbers is" +n3);
}
}
else
{
if(n2>n3)
{
System.out.print("Greatest among the three numbers is" +n2);
}
else
{
System.out.print("Greatest among the three numbers is" +n3);
}
}
}
}



