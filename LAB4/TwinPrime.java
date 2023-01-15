/**
 * Write a Java method to find all twin prime numbers less than 100.
Expected Output: (define a method to check if a number is prime or not)
(3, 5)
(5, 7)
(11, 13)
(17, 19)
(29, 31)
(41, 43)
(59, 61)
(71, 73)
 *
 * @author (Lakpa Futi Lama)
 * @version (15)
 */
import java.util.Scanner;
public class TwinPrime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Java method to find all twin prime numbers less than 100. ");
        System.out.println("Enter range upto");
        int m = sc.nextInt();
        for(int i=2; i<=m; i++)
        {
            if(checkPrime(i) && checkPrime(i+2))
            {
                System.out.printf("(%d,%d)\n",i,i+2);
            }
        }
    }

    public static boolean checkPrime(int n)
    {
        boolean check=true;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                check=false;
            }
        }
        return check;
    }
}