/**
 * Write a Java Program that sorts an String array input by user in descending alphabetic order.
 *
 * @author (Lakpa Futi Lama)
 * @version (18)
 */
import java.util.Scanner;
public class Descending_Alporder
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program that sorts an String array input by user in descending alphabetic order");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        String []x=new String[n];
        sc.nextLine();
        for(int i=0; i<x.length; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextLine();
        }
        System.out.print("The array is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        String temp ="";
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(x[i].compareTo(x[j])<0){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println("The descending order of array is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
    }
}