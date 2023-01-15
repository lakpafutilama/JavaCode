
/**
 * Write a program that takes two numbers as input from users and print the largest among them using ternary operator.
 * @author (Lakpa Futi Lama)
 * @version (24)
 */
import java.util.Scanner;
public class LargestTwo_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print the largest among two using ternary operator");
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        String c=(a>b)? "First number "+a+" is the largest.":"Second number "+b+" is the largest.";
        System.out.println(c);
    }
}
