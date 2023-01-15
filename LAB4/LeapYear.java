/**
 * Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
 Expected Output:
 Input a year: 2017
 false
 *
 * @author (Lakpa Futi Lama)
 * @version (11)
 */
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to check whether a year entered by the user is a leap year or not");
        System.out.println("Enter the year");
        int x=sc.nextInt();
        System.out.println(checkLeapYear(x));
    }
    
    public static boolean checkLeapYear(int y)
    {
        boolean check;
        if(y%4==0){
            if(y%100!=0){
                check=true;
            }
            else{
                if(y%400==0){
                    check=true;
                }
                else{
                    check=false;
                }
            }
        }
        else{
            check=false;
        }
        return check;
    }
}
