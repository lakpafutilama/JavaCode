/**
 * Write a Java Program to print all the LEADERS in the array. Note: An element is leader if it is greater than all the elements to its 
 right side.
 * //2 3 4 5 1 3 
 * @author (Lakpa Lama)
 * @version (27)
 */
import java.util.Scanner;
public class Leader
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print all the LEADERS in the array");
        System.out.println("Enter size in array");
        int n=sc.nextInt();
        int []x=new int[n];
        boolean check=true;
        System.out.println("Enter the elements for array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();//2 3 4 5 1 3
        for(int i=0; i<(n-1); i++){
            for(int j=i+1; j<n; j++){
                if(x[i]<x[j]){
                    check=false;
                    break;
                }
            }
            if(check==true){
                System.out.println("The leader is "+x[i]);
            }
            check=true;
        }
    }
}