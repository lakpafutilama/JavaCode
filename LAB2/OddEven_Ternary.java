
/**
 *Write a program that checks if the number input by user is odd or even and display message accordingly using ternary operator
 *
 * @author (Lakpa Futi Lama)
 * @version (25)
 */
import java.util.Scanner;
public class OddEven_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to checks if the number input by user is odd using ternary operator.");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String c=(n%2==0)? (n+" is even number."):(n+" is odd number.");
        System.out.println(c);
    }
}
