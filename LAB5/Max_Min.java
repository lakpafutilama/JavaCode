/**
 * Write a Java Program to find the maximum and minimum value of an array.
 *
 * @author (Lakpa Futi Lama)
 * @version (8)
 */
import java.util.Scanner;
public class Max_Min
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the maximum and minimum value of an array.");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Number:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        int max=x[0], min=x[0];
        for(int i=0; i<n; i++){
            if(max<x[i]){
                max=x[i];
            }
            else if(min>x[i]){
                min=x[i];
            }else{
                max=max;
                min=min;
            }
        }
        System.out.printf("The maximum value is %d and minimum value is %d",max,min);
    }
}