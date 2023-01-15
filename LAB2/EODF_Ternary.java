
/**
 * Write a program that checks if the number input by user is both even and divisible by 5 or not and display message accordingly 
 using ternary operator.
 *
 * @author (Lakpa Futi Lama)
 * @version (27)
 */
import java.util.Scanner;
public class EODF_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that checks if the number input by user is both even and divisible by 5 or not using ternary operator.");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String a=(n%2==0)? ((n%5==0)?(n+" is even and divisible by 5."):(n+" is even but not divisible by 5.")):((n%5==0)?(n+" is odd and divisible by 5."):(n+" is odd but not divisible by 5."));
        System.out.println(a);
    }
}