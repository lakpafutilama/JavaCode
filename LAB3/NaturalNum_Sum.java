/**
 * Write a program in Java to display n terms of natural numbers and their sum.
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class NaturalNum_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to display n terms of natural numbers and their sum.");
        System.out.println("Display number upto ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.printf("The sum is %d.",sum);
    }
}