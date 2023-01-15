/**
 * Write a Java Program to remove a specific element from an array
 *
 * @author (your name)
 * @version (5)
 */
import java.util.Scanner;
public class Remove
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to remove a specific element from an array");
        System.out.println("Enter the value of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the number for position: "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array element are: ");
        for(int i=0; i<n; i++){
            System.out.println(x[i]);
        }
        System.out.println("Enter the element to be removed");
        int r=sc.nextInt();
        for(int i=0; i<n; i++){
            if((x[i])==r){
                x[i]=0;
            }
        }
        System.out.println("The changed value after removing element are: ");
        for(int i=0; i<n; i++){
            System.out.println(x[i]);
        }
    }
}