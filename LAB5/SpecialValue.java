/**
 * Write a Java program to test if an array contains a specific value. (Linear Search)
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class SpecialValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to test if an array contains a specific value");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] x= new int[n];
        boolean check=false;
        for (int i=0; i<n; i++){
            System.out.println("Number "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("Enter a number to check");
        int z=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
            if((x[i])==z){
                check=true;
                break;
            }
        }
        System.out.println();
        if(check==true)
            System.out.println("The special value "+z+" is in array.");
        else
            System.out.println("The special value "+z+" is not in array.");
    }
}