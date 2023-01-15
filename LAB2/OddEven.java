/**Write a program that checks if the number input by user is odd or even and display message accordingly.
 * @author (Lakpa Futi Lama)
 * @version (2)
 */
import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to display either the given number is odd or even");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n%2==0)
        System.out.printf("The given number %d is even.",n);
        else
        System.out.printf("The given number %d is odd.",n);
    }
}