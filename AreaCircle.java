
import java.util.Scanner;
public class AreaCircle
{
    public static void main(String args[])
    {
    	Scanner reader = new Scanner(System.in);
	System.out.print("\nenter the radius of circle");
	double radius = reader.nextDouble();
	double area = 3.14 * radius * radius;
	System.out.print("\narea of the given circle is "+area);
    }
}
