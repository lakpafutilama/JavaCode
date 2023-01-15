/**
 * Write Java methods to calculate the area of a triangle. 
  Expected Output:
  Input Side-1: 10
  Input Side-2: 15
  Input Side-3: 20
  The area of the triangle is 72.6184377413890
 *
 * @author (Lakpa Futi Lama)
 * @version (14)
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A Java methods to calculate the area of a triangle");
        System.out.println("Enter 1st side");
        int a=sc.nextInt();
        System.out.println("Enter 2nd side");
        int b=sc.nextInt();
        System.out.println("Enter 3rd side");
        int c=sc.nextInt();
        double area=calArea(a,b,c);
        System.out.println(area);
    }
    
    public static double calArea(int x, int y, int z)
    {
        double s=(x+y+z)/2;
        double t=s*(s-x)*(s-y)*(s-z);
        double a=Math.sqrt(t);
        return a;   
    }
}