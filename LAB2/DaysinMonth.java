/**
 * Write a Java program to find the number of days in a month
Input a month number: 2
Input a year: 2016
February 2016 has 29 days
 *
 * @author (Lakpa Futi Lama)
 * @version (30)
 */
import java.util.Scanner;
public class DaysinMonth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to find the number of days in a month");
        System.out.println("Enter the month");
        int m=sc.nextInt();
        System.out.println("Enter the year");
        int y=sc.nextInt();
        switch(m){
            case 1:
                System.out.println("There are 31 days in January, "+y);
                break;
            case 2:
                if (y%4!=0){
                    System.out.println("There are 28 days in February, "+y);
                }else
                if (y%100!=0){
                    System.out.println("There are 29 days in February, "+y);
                }else
                if (y%400==0){
                    System.out.println("There are 29 days in February, "+y);
                }else{
                    System.out.println("There are 28 days in February, "+y);
                }
                System.out.println("");
                break;
            case 3:
                System.out.println("There are 31 days in March, "+y);
                break;
            case 4:
                System.out.println("There are 30 days in April, "+y);
                break;
            case 5:
                System.out.println("There are 31 days in May, "+y);
                break;
            case 6:
                System.out.println("There are 30 days in June, "+y);
                break;
            case 7:
                System.out.println("There are 31 days in July, "+y);
                break;
            case 8:
                System.out.println("There are 31 days in August, "+y);
                break;
            case 9:
                System.out.println("There are 30 days in September, "+y);
                break;
            case 10:
                System.out.println("There are 31 days in October, "+y);
                break;
            case 11:
                System.out.println("There are 30 days in November, "+y);
                break;
            case 12:
                System.out.println("There are 31 days in December, "+y);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}