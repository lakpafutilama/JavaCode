/**
 * Write a java program to input n integer values from user, store it into an array and print all the elements
 *
 * @author (Lakpa Futi Lama)
 * @version (1)
 */
import java.util.Scanner;
public class Integers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to input n integer values from user and print all the elements");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Number "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(x[i]);
            if(i<(n-1)){
                System.out.print(", ");
            }
        }
    }
}