import java.util.Scanner;
public class Typecast
{
public static void main(String[]args)
    {
double l,b,a;
       Scanner ip= new Scanner(System.in);
System.out.println("Enter a length: ");
       l= ip.nextDouble();
System.out.println("Enter a breadth: ");
       b= ip.nextDouble();
       a= l*b;
System.out.println("Area of reactangle: "+a);
System.out.println("Converting double into int: ");
int i=(int)a;
System.out.println("Area of rectangle in int value: "+i);
    }
}
