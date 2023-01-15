/**Write a program that checks if the number input by user is divisible by 5 or not and display message accordingly.
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class DivisibleFive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to check whether the input number is divisible by 5 or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n%5==0)
        System.out.printf("The given number %d is divisible by 5.",n);
        else
        System.out.printf("The given number %d is not divisible by 5.",n);
    }
}