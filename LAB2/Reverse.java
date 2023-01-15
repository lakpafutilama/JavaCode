/**
Write a program to print the reverse of a 3-digit number input by user.
Example: if the number input by user is 325, then the output should be 523.
* @author (Lakpa Futi Lama)
* @version (13)
*/ 
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print the reverse of a 3-digit number input by user");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n%10;
        int b=n/10;
        int c=b%10;
        int d=b/10;
        int r=a*100+c*10+d;
        System.out.printf("The reverse of %d is %d.",n,r);
    }
}