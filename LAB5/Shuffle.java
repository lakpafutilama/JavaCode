/**
 * Write a Java Program to shuffle a given array of integers.
 *
 * @author (Lakpa Futi Lama)
 * @version (35)
 */
import java.util.Scanner;
import java.util.Random;
public class Shuffle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to shuffle a given array of integers");
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        Random rand=new Random();
        int r=rand.nextInt(n);
        System.out.println("Enter the elements for array");
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                temp=x[i];
                x[i]=x[r];
                x[r]=temp;
            }
        }
        System.out.println("The shuffled array is: ");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
    }
}