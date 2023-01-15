/**
 * Write a Java Program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.
 *
 * @author (Lakpa Futi Lama)
 * @version (29)
 */
import java.util.Scanner;
public class Segregates
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
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int k=0;
        for(int i=0; i<n; i++){
            if(x[i]==0){
                k++;
            }
        }
        System.out.println("The segregated array is:");
        for(int i=0; i<n; i++){
            if(i<k){
                System.out.print("0"+" ");
            }else{
                System.out.print("1"+" ");
            }
        }
    }
}