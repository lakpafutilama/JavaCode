
/**
 * Write a program to check whether the year input by user is leap year or not using ternary operator.
 *
 * @author (Lakpa Futi Lama)
 * @version (28)
 */
import java.util.Scanner;
public class LeapYear_Ternary
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("A program to check whether the year input by user in leap year or not using ternary operator.");
        System.out.println("Enter the year");
        int y=sc.nextInt();
        String c=(y%4==0)? (y%100!=0)? (y+" is a leap year."):(y%400==0)? (y+" is a leap year."):(y+" is not a leap year."):(y+" is not a leap year.");
        System.out.println(c);
    }
}
