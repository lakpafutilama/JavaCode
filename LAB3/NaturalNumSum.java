/**
 * Write a program in Java to display n terms of natural numbers and their sum.
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class NaturalNumSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to display n terms of natural numbers and their sum.");
        System.out.println("Display number upto ");
        int n=sc.nextInt();
        int sum=0, i=1;
        while (i<=n){
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.printf("The sum is %d.",sum);
    }
}