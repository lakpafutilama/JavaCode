/**
 * A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
* @author(Lakpa Futi Lama)
* @version(19)
 */
import java.util.Scanner;
public class Attendence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether the student is allowed to sit in exam or not");
        System.out.println("Enter the number of classes held");
        double a=sc.nextDouble();
        System.out.println("Number of classes attended");
        double b=sc.nextDouble();
        double p=(b/a)*100;
        if(p<75){
            System.out.println("The attendence is "+p+" so the student is not allowed to sit in exam.");
        }else if(p>=75 && p<=100){
            System.out.println("The attendence is "+p+" so the student is allowed to sit in exam.");
        }else{
            System.out.print("Wrong input");
        }
    }
}