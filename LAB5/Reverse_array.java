/**
 * Write a Java Program to reverse an array of integer values
 *
 * @author (Lakpa Futi Lama)
 * @version (10)
 */
import java.util.Scanner;
public class Reverse_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to reverse an array of integer values");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            System.out.println(x[i]);
        }
        int []y=new int[n];
        System.out.println("The reversed array is:");
        for(int i=0; i<n; i++){
            int j=i+1;
            y[i]=x[n-j];
            System.out.println(y[i]);
        }
    }
}