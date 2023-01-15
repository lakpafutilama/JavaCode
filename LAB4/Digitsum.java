/**
 * Write a Java method to compute the sum of the digits in an integer.
 Test Data:
 Input an integer: 25
 Expected Output:
 The sum is 7
 *
 * @author (Lakpa Futi Lama)
 * @version (8)
 */
import java.util.Scanner;
public class Digitsum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to compute the sum of the digits in an integer");
        System.out.println("Enter the digit");
        int d=sc.nextInt();
        System.out.printf("The sum of digits of %d is %d.",d, findSum(d));
    }

    public static int findSum(int a)
    {
        int s=0;
        while(a>0)
        {
            int b=a%10;
            s+=b;
            a=a/10;
        }
        return s;
    }
}