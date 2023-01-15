/**
 * Write a program in Java to input 5 numbers from keyboard and find their sum and average.
 *
 * @author (Lakpa Futi Lama)
 * @version (4)
 */
import java.util.Scanner;
public class Sum_Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to input 5 numbers from keyboard and find their sum and average.");
        int sum=0;
        for(int i=1; i<=5; i++){
            System.out.println("Input number"+i);
            int n=sc.nextInt();
            sum=sum+n;
        }
        int a=sum/5;
        System.out.printf("The sum is %d and average is %d.",sum,a);
    }
}