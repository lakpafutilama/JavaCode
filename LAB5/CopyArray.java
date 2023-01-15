/**
 * Write a Java program to copy an array by iterating the array.
 *
 * @author (Lakpa Futi Lama)
 * @version (6)
 */
import java.util.Scanner;
public class CopyArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to copy an array by iterating the array.");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the value for position: "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the value upto where you want to print");
        int m=sc.nextInt();
        int y[]=new int[m];
        System.out.print("The copied array is: ");
        for(int i=0; i<m; i++){
            if(i<n){
                y[i]=x[i];
            }else{
                y[i]=0;
            }
        System.out.print(y[i]+" ");
        }
    }
}