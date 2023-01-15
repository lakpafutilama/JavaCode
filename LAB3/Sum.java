/**
 * Write a program in Java to display n terms of natural numbers and their sum.
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to display n terms of natural numbers and their sum.");
        System.out.println("Enter the termm");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.printf("The sum of natural number upto number %d term is %d.",n,sum);
    }
}