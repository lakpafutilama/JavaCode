
/**
 * Write a program that checks if the number input by user is divisible by 5 or not and display message accordingly using ternary operator
 *
 * @author (Lakpa Futi Lama)
 * @version (26)
 */
import java.util.Scanner;
public class DivisibleFive_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that checks if the number input by user is divisible by 5 or not using ternary operator");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String c=(n%5==0)? (n+" is divisible by 5."):(n+" is not divisible by 5.");
        System.out.println(c);
    }
}

