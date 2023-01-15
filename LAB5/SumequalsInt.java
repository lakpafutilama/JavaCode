/**
 * Write a Java Program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6] Target value: 6.
 *
 * @author (Lakpa Futi Lama
 * @version (26)
 */
import java.util.Scanner;
public class SumequalsInt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements for array");
        for (int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        System.out.println("Enter the integer which should be equal to sum");
        int m=sc.nextInt();//6
        for (int i=0; i<n-1; i++){// 1 2 3 4 5 6
            for(int j=i+1; j<n; j++){
                if((x[i]+x[j])==m){
                    System.out.println("The sum of "+x[i]+" and "+x[j]+" is "+m);
                }
            }
        }
    }
}