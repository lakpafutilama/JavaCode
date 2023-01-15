/**
 * Write a Java Program to find smallest and second smallest elements of a given array.
 *
 * @author (Lakpa Futi Lama)
 * @version (28)
 */
import java.util.Scanner;
public class SmallestnSs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the second largest element in an array");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []y=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            y[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(y[i]+" ");
        }
        System.out.println();
        int t=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(y[i]>y[j]){
                    t=y[i];
                    y[i]=y[j];
                    y[j]=t;
                }
            }
        }

        System.out.println("The smallest value is "+y[0]);
        System.out.println("The second smallest value is "+y[1]);
    }
}