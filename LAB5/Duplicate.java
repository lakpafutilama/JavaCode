/**
 * Write a Java Program to find the duplicate values of an array of integer values.
 *
 * @author (Lakpa Futi Lama)
 * @version (11)
 */
import java.util.Scanner;
public class Duplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the duplicate values of an array of integer values");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements for array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        int d=0;
        int []y=new int[n];
        for(int i=0; i<n-1; i++){
            if(x[i]==x[i+1]){
                y[d]=x[i];
                d++;
            }
        }
        System.out.println("The duplicate value is:");
        for(int i=0; i<d; i++){
            System.out.print(y[i]+" ");
        }
    }    
}