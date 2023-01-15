/**
Write a program to find the sum of 3-digit number input by user.
Example: if the sum of 234 is 2+3+4=9.
* @author (Lakpa Futi Lama)
* @version (14)
*/
import java.util.Scanner;
public class DigitSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the sum of 3-digit number input by user.");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n%10;
        int b=n/10;
        int c=b%10;
        int d=b/10;
        int s=a+c+d;
        System.out.printf("The sum of digit %d is %d.",n,s);
    }
}