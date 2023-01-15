/**
 * Write a Java Program to insert an element (specific position) into an array.
 *
 * @author (Lakpa Futi Lama)
 * @version (7)
 */
import java.util.Scanner;
public class Insert_element
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to insert an element (specific position) into an array.");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the value for position: "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Enter element you want to insert");
        int e=sc.nextInt();
        System.out.println("Choose specific index for element from:0-"+(n-1));
        int p=sc.nextInt();
        int m=n+1;
        int []y=new int[m];
        System.out.print("The changed array is: ");
        for(int i=0; i<=p; i++){
            y[i]=x[i];
            if(i==p){
                y[i]=e;
                System.out.print(y[i]+" ");
                for(int j=i+1; j<m; i++,j++){
                    y[j]=x[i];
                    System.out.print(y[j]+" ");
                }
                break;
            }
            System.out.print(y[i]+" " );
        }
    }
}