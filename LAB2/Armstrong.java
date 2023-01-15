/**
Write a program to check it a number input by user is Armstrong number or not.
Example: 153 is Armstrong number since 13 +53 +33= 153
* @author (Lakpa Futi Lama)
* @version (16)
*/
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether the inputed number is Armstrong number or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n%10;
        int b=n/10;
        int c=b%10;
        int d=b/10;
        int s=(int)((Math.pow(a,3))+(Math.pow(c,3))+(Math.pow(d,3)));
        if(n==s)
        System.out.printf("The given number %d is armstrong number.",n);
        else
        System.out.printf("The given number %d is not armstrong number.",n);
    }
}