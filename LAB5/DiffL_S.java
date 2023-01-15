/**
 * Write a Java Program to get the difference between the largest and smallest values in an array of integers.
 * The length of the array must be 1 and above.
 *
 * @author (Lakpa Futi Lama)
 * @version (9)
 */
import java.util.Scanner;
public class DiffL_S
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to get the difference between the largest and smallest values in an array of integers.");
        System.out.println("Enter siize of array");
        int n=sc.nextInt();
        int []x= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for (int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int max=x[0], min=x[0];
        for(int i=0; i<n; i++){
            if(max<x[i]){
                max=x[i];
            }else if(min>x[i]){
                min=x[i];
            }else{
                max=max;
                min=min;
            }
        }
        int diff=max-min;
        System.out.println("The difference between the largest and smallest value in the array is "+diff);
    }
}