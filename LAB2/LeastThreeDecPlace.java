/**
 * Write a Java program that reads in two integer numbers and tests whether they are the same up to three position 
starting from the least position.
Test Data
Input integer number: 123424256
Input integer another number: 3256
Expected Output :
They are same
 *
 * @author (Lakpa Futi Lama)
 * @version (23)
 */
import java.util.Scanner;
public class LeastThreeDecPlace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to tests whether two inputs are same up to three position starting from the least position.");
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a%1000;
        int d=b%1000;
        if (c==d){
            System.out.println("They are same up to three position starting from the least position.");
        }else{
            System.out.println("They are not same up to three position starting from the least position.");
        }
    }
}

