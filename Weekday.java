import java.util.Scanner;
public class Weekday
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter a number");
int num = reader.nextInt();
int rem = num%7;
if(rem==0)
{
System.out.print("It is sunday");
}
else if (rem==1)
{
System.out.print("It is monday");
}
else if (rem==2)
{
System.out.print("It is tuesday");
}
else if (rem==3)
{
System.out.print("It is wednesday");
}
else if (rem==4)
{
System.out.print("It is thursday");
}
else if (rem==5)
{
System.out.print("It is friday");
}
else if (rem==6)
{
System.out.print("It is saturday");
}
}
}

