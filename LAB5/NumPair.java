/**
 * Write a Java Program to find all pairs of elements in an array whose sum is equal to a specified number.
 *
 * @author (Lakpa Futi Lama)
 * @version (19)
 */
import java.util.Scanner;
public class NumPair
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program to find all pairs of elements in an array whose sum is equal to a specified number");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements  array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("Enter a specific number");
        int s=sc.nextInt();
        System.out.println("Elements whose sum is "+s);
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                if(x[i]+x[j]==s){
                    System.out.println("("+x[i]+","+x[j]+")");
                }
            }
        }
    }
}