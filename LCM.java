import java.util.Scanner;
public class LCM
{
public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("Enter the first number");
int num1 = reader.nextInt();
System.out.print("Enter the second number");
int num2 = reader.nextInt();
int lcm = (num1>num2)?num1:num2;
boolean test = true;
while(test==true)
{
if(lcm%num1 == 0 && lcm%num2 == 0)
{
test=false;
break;
}
lcm++;
}
System.out.print(lcm);
}
}