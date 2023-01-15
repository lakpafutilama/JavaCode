/**
 * Write a program to calculate the factorial of number input by user
Test Data
Input an integer: 5
Expected Output : 120
 *
 * @author (your name)
 * @version (15)
 */
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to calculate the factorial of number input by user");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1; i<=n; i++){
            fac=fac*i;
        }
        System.out.println("The factorial of "+n+" is "+fac);
    }
}