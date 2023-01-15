/**
 * Write a Java Program to check if an array of integers without 0 and -1.
 *
 * @author (Lakpa Futi Lama)
 * @version (23)
 */
import java.util.Scanner;
public class CheckArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to check if an array of integers without 0 and -1");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("");
        boolean check=false;
        int y=0, z=-1;
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
        if(check==true){
            System.out.println("The array contains both 0 & -1 integer");
        }else{
            System.out.println("The array doesnot both contains 0 & -1 integer");
        }
    }
}