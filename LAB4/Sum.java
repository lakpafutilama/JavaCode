/**
 * Write a Java method that takes two integers as argument and returns their sum.
 *
 * @author (Lakpa Futi Lama)
 * @version (2)
 */
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int s=findSum(a,b);
        System.out.println("The sum is "+s);
    }
    
    public static int findSum(int a, int b)
    {
        int s=a+b;
        return s;
    }
}