/**
 * Write a program that prints n Fibonacci numbers, where n is input from user
Example:
input: 7
Output: 1 1 2 3 5 8 13
 *
 * @author (Lakpa Futi Lama)
 * @version (22)
 */
import java.util.Scanner;
public class Fabonacci
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
        System.out.print("The fibonacci number are: "+a+" "+b+" ");
        for(int i=2; i<n; i++){
            f=a+b;
            System.out.print(f+" ");
            a=b;
            b=f;
        }
    }
}
