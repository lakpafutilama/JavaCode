/**
 * Write a Java program that reads in two floating-point numbers and tests whether they are the same up to n decimal places,
 n input from user.
Test Data
Input floating-point number: 1.256355
Input floating-point another number: 1.25621312
precision: 3
Expected Output :
They are different
 *
 * @author (Lakpa Futi Lama)
 * @version (30)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class nDec_Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to test two floating numbers up to n decimal number");
        String s="#.";
        System.out.println("Enter the 1st Floating-point number");
        float a=sc.nextFloat();
        System.out.println("Enter the 2nd Floating-point number");
        float b=sc.nextFloat();
        System.out.println("Enter the precision");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            s+="#";
        }
        DecimalFormat df=new DecimalFormat(s);
        String c=df.format(a);
        String d=df.format(b);
        System.out.println(c);
        System.out.println(d);
        if(c.equals(d))
        {
            System.out.println("They are same");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}