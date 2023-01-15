/**
 * Write a Java Program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
 *
 * @author (Lakpa Futi Lama)
 * @version (29)
 */
import java.util.Scanner;
public class Segregate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.");
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements 0 & 1");
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
    }
}