/**Write a program that takes two numbers as input from users and print the largest among them.
 * @author (Lakpa Futi Lama)
 * @version (1)
 */
import java.util.Scanner;
public class PrintLarger
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to print largest number among two input number");
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        if (a!=b)
            if (a>b){
                System.out.println(a+" is greater than "+b);
            }else{
                System.out.println(b+" is greater than "+a);
            }
        else
        System.out.println(a+" is equal to "+b);
    }
}