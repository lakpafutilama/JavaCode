/**
 * Write a Java Program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
 *
 * @author (Lakpa Futi Lama)
 * @version (32)
 */
//1 2 3 4 5 6  2 4 6 1 3 5
import java.util.Scanner;
public class SeparateEO
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to separate even and odd numbers of a given array of integers");
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array is");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            if(x[i]%2==0){
                System.out.print(x[i]+" ");
            }
        }
        for(int i=0; i<n; i++){
            if(x[i]%2!=0){
                System.out.print(x[i]+" ");
            }
        }
    }
}