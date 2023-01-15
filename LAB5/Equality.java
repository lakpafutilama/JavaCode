/**
 * Write a Java Program to test the equality of two arrays.
 *
 * @author (Lakpa Futi Lama)
 * @version (20)
 */
import java.util.Scanner;
public class Equality
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program to test the equality of two arrays.");
        System.out.println("Enter size of 1st array");
        int a=sc.nextInt();
        int []x=new int[a];
        System.out.println("Enter elements for 1st array");
        for(int i=0; i<a; i++){
            x[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter size of 2nd array");
        int b=sc.nextInt();
        int []y=new int[b];
        System.out.println("Enter elements for 2nd array");
        for(int i=0; i<b; i++){
            y[i]=sc.nextInt();
        }
        boolean check=false;
        if(a==b){
            for(int i=0; i<a; i++){
                if(x[i]==y[i]){
                    check=true;
                }
                else{
                    check=false;
                    break;
                }
            }
        }else{
            check=false;
        }
        if(check==true){
            System.out.println("Two array are equal");
        }else{
            System.out.println("Two array are not equal");
        }
    }
}