/**
 * Write a Java Program to find the number of even and odd integers in a given array of integers.
 *
 * @author (Lakpa Futi Lama)
 * @version (21)
 */
import java.util.Scanner;
public class NbrofEO
{
   public static void main(String[] args)
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("A program to find the number of even and odd integers in a given array of integers");
       System.out.println("Size of array");
       int n=sc.nextInt();
       int []x=new int[n];
       int o=0, e=0;
       for(int i=0; i<n; i++){
           System.out.println("Element:"+(i+1));
           x[i]=sc.nextInt();
       }
       System.out.println("The array is:");
       for(int i=0; i<n; i++){
           System.out.print(x[i]+" ");
       }
       System.out.println();
       for(int i=0; i<n; i++){
           if(x[i]%2==0){
               e++;
           }else{
               o++;
           }
       }
       System.out.println("No. of Even integer="+e);
       System.out.println("No. of Odd integer="+o);
   }
}