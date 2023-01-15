/**
 * Write a Java Program to find the common elements between two arrays of integers.
 *
 * @author (Lakpa Futi Lama)
 * @version (12)
 */
import java.util.Scanner;
public class Common_twoarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the common elements between two arrays of integers");
        System.out.println("Enter size of 1st array");
        int a=sc.nextInt();
        int []x=new int[a];
        System.out.println("Enter elements for 1st array");
        for(int i=0; i<a; i++){
            x[i]=sc.nextInt();
        }
        System.out.println("The 1st array is:");
        for(int i=0; i<a; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Enter size of 2nd array");
        int b=sc.nextInt();
        int []y=new int[b];
        System.out.println("Enter elements for 2nd array");
        for(int j=0; j<b; j++){
            y[j]=sc.nextInt();
        }
        System.out.println("The 2nd array is:");
        for(int j=0; j<b; j++){
            System.out.print(y[j]+" ");
        }
        System.out.println();
        System.out.println("The common array elements are:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(x[i]==y[j]){
                    System.out.print(x[i]+" ");
                }
            }
        }
    }
}