/**
 * Write a Java Program to remove the duplicate elements of a given array and return the new length of the array.
 * Sample array: [20, 20, 30, 40, 50, 50, 50]
 * After removing the duplicate elements the Program should return 4 as the new length of the array.
 *
 * @author (your name)
 * @version (25)
 */
import java.util.Scanner;
public class Dup_Remove
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to remove the duplicate elements of a given array and return the new length of the array");
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        int m=0;
        for(int i=0; i<n-1; i++){
            if(x[i]!=x[i+1]){
                x[m]=x[i];
                m++;
            }
        }
        System.out.println();
        int l=m+1;
        System.out.println("After removing the duplicate elements, the new length of the array is "+l);
    }
}