/**
 * Write a Java program to sum values of an array input from user. Also calculate the average value of the elements.
 *
 * @author (Lakpa Futi Lama)
 * @version (2)
 */
import java.util.Scanner;
public class Sum_Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find sum values of an array input from user and their average");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        int sum=0;
        for (int i=0; i<n; i++){
            System.out.println("Enter the Number "+(i+1));
            x[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++){
            sum+=x[i];
        }
        int avg=sum/n;
        System.out.printf("The sum is %d and average is %d.",sum,avg);
    }
}