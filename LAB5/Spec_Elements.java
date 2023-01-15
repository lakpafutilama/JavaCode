/**
 * Write a Java Program to check if an array of integers contains two specified elements 65 and 77
 *
 * @author (Lakpa Futi Lama)
 * @version (24)
 */
import java.util.Scanner;
public class Spec_Elements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to check if an array contains two specified elements 65 and 77");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] x= new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Number:"+(i+1));
            x[i]=sc.nextInt();
        }
        int y=65, z=77;
        boolean check=false;
        for(int i=0; i<n; i++){
            if(x[i]==y || x[i]==z){
                for(int j=i+1; j<n; j++){
                    if(x[j]==z || x[j]==y){
                        check=true;
                        break;
                    }
                }
            }
        }
        System.out.println();
        if(check==true){
            System.out.println("The special value "+y+" & "+z+" are in array.");
        }else{
            System.out.println("The special value "+y+" & "+z+" are not in array.");
        }
    }
}