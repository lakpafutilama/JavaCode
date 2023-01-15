/**
 * Write a Java Program to find the second largest element in an array.
 *
 * @author (Lakpa Futi Lama)
 * @version (13)
 */
import java.util.Scanner;
public class Second_Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the second largest element in an array");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []y=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            y[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(y[i]+" ");
        }
        int max=0, max2=0;
        for(int i=0; i<n; i++){
            if(y[i]>max){
                max2=max;
                max=y[i];
            }else if(y[i]>max2){
                max2=y[i];
            }else{
                max=max;
                max2=max2;
            }
        }
        System.out.println("The second largest value is "+max2);
    }
}