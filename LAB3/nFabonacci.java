/**
 * Write a program that prints nth Fibonacci number, where n is input from user
Example:
input: 7
Output: 13
 *
 * @author (Lakpa Futi Lama)
 * @version (23)
 */
import java.util.Scanner;
public class nFabonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that prints Fibonacci number");
        System.out.println("Enter the input");
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int f=0;
        for(int i=2; i<n; i++){
            f=a+b;
            a=b;
            b=f;
        }
        System.out.print("The "+n+"th fibonacci number is "+f);
    }
}