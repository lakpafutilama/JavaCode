/**
Write a program to print absolute value of a number entered by user. E.g.-
INPUT: 1 OUTPUT: 1
INPUT: -1 OUTPUT: 1
* @author (Lakpa Futi Lama)
* @version (17)
*/
import java.util.Scanner;
public class AbsoluteValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print absolute value of a number entered by user");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n*(-1);
        if (n<0)
        System.out.printf("The absolute value of %d is %d.",n,a);
        else
        System.out.printf("The absolute value of %d is %d.",n,n);
    }
}