/**
 * Write a Java Program to find maximum difference between two elements in a given array of integers such that smaller element appears 
before larger element.
Example: Input : nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output: The maximum difference between two elements of the said array elements 10
 *
 * @author (Lakpa Futi Lama)
 * @version (37)
 */
import java.util.Scanner;
public class Maxdiff
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to find maximum difference in array where smaller element appears before larger element");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter element for array");
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(i%2==0){
                    if(x[i]>x[j]){
                        t=x[i];
                        x[i]=x[j];
                        x[j]=t;
                    }
                }
            }
        }
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
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
        int d=max-min;
        System.out.println("The maximum difference between two elements in array is "+d);
    }
}