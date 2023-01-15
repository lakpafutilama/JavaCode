/**
 * Write a Java Program to cyclically rotate a given array clockwise by one.
 *
 * @author (Lakpa Futi Lama)
 * @version (30)
 */
import java.util.Scanner;
public class Cyclically
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program to cyclically rotate a given array clockwise by one.");
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements for array");
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        
        int []y=new int[n];
        System.out.println("The cyclically rotated array is:");
        for(int i=1; i<n; i++){
            y[i]=x[i-1];
        }
        y[0]=x[n-1];
        for(int i=0; i<n; i++){
            System.out.print(y[i]+" ");
        }
    }
}