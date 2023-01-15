/**Write a program to check whether the year input by user is leap year or not.
 * @author (Lakpa Futi Lama)
 * @version (8)
 */
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program whether the input year is leap year");
        System.out.println("Enter the year");
        int y=sc.nextInt();
        if (y%4!=0){
            System.out.println(y+" is not a leap year.");
        }else{
            if (y%100!=0){
                System.out.println(y+" is a leap year.");
            }else{
                if (y%400==0){
                    System.out.println(y+"  is a leap year.");
                }else{
                    System.out.println(y+" is not a leap year");
                }
            }
        }
    }
}