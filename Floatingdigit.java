import java.util.Scanner;
import java.lang.Math;
public class Floatingdigit
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter first number");
double n1 = reader.nextDouble();
System.out.print("Enter second number");
double n2 = reader.nextDouble();
reader.close();
if(Math.abs(n1-n2)<=0.001){
System.out.println("Both the numbers entered are same");
}
else {
System.out.println("Both the numbers entered are different");
}
}
}