/**
 * Write a program that takes three numbers as input from users and print the largest among them using ternary operator.
 *
 * @author (your name)
 * @version (29)
 */
import java.util.Scanner;
public class LargestThree_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print the largest among three input numbers using ternary operator.");
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        String l=(a>b)? (a>c)? (a+" is the largest number."):(c+" is the largest number."):(b>c)? (b+" is the largest number."):(c+" is the largest number.");
        System.out.println(l);
    }
}