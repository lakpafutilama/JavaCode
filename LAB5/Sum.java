/**
 * Write a Java Program to compute the average value of an array of integers except the largest and smallest values.
 *
 * @author (Lakpa Futi Lama)
 * @version (22)
 */
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program to compute average value of an array except largest and smallest values");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements for array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        int s=0;
        System.out.println("The array is:");
        for(int i=0; i<n; i++){ 
            s+=x[i];
            System.out.print(x[i]+" ");
        }
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
        double a=(s-max-min)/(n-2);
        System.out.println("The average without maximum and minimum value is "+a);
    }
}