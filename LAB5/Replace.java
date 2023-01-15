/**
 * Write a Java Program to insert an element (specific position) into an array.
 *
 * @author (Lakpa Futi Lama)
 * @version (7)
 */
import java.util.Scanner;
public class Replace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to insert an element (specific position) into an array.");
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the value for position: "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n; i++){
            System.out.println(x[i]);
        }
        System.out.println("Enter the element to insert");
        int e=sc.nextInt();
        System.out.println("Choose the specific index to insert element:0-"+(n-1));
        int p=sc.nextInt();
        int y[]=new int[n];
        System.out.println("The changed elements are: ");
        for(int i=0; i<n; i++){
            y[i]=x[i];
            y[p]=e;
            System.out.println(y[i]+" " );
        }
    }
}