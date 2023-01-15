/**
 * Write a Java Program to remove a specific element from an array
 *
 * @author (your name)
 * @version (5)
 */
import java.util.Scanner;
public class RemoveElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to remove a specific element from an array");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the number for position: "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(x[i]);
        }
        System.out.println();
        int []y=new int[n-1];
        System.out.println("Enter the element to be removed");
        int r=sc.nextInt();
        int j=0;
        for(int i=0; i<n-1; i++){
            if((x[i])==r){
                j++;
            }
            y[i]=x[j];
            j++;
        }
        System.out.println("The changed array after removing element is: ");
        for(int i=0; i<n-1; i++){
            System.out.println(y[i]);
        }
    }
}