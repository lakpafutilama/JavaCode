/**
 * Write a Java program to find the index of an array element.
 *
 * @author (Lakpa Futi Lama)
 * @version (4)
 */
import java.util.Scanner;
public class IndexoNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the index of an array element.");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] x= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Number "+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.println("Enter a number to find its index");
        int m=sc.nextInt();
        int z=0;
        boolean check=false;
        for(int i=0; i<n; i++){
            if(m==x[i]){
                z=i;
                check=true;
                break;
            }
        }
        if(check==true){
            System.out.println(m+" is in index "+z);
        }else{
            System.out.println("Input doesnot exist");
        }
    }
}