/**
 * Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
Test Data
Input floating-point number: 1.256355
Input floating-point another number: 1.25621312
Expected Output :
They are same
 * @author (Lakpa Futi Lama)
 * @version (22)
 */
import java.util.Scanner;
public class ThreeDecimalPlace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to test whether the two input floating numbers are same up to 3 decimal places");
        System.out.println("Enter the 1st floating number");
        double a=sc.nextDouble();
        System.out.println("Enter the 2nd floating number");
        double b=sc.nextDouble();
        double c=(int)a*1000;
        double d=(int)b*1000;
        if (c==d){
            System.out.println("They are same up to three decimal places.");
        }else{
            System.out.println("They are not same up to three decimal places.");
        }
    }
}
