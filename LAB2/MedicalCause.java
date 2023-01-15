/**
Modify the above question to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 * @author (Lakpa Futi Lama)
 * @version (20)
 */
import java.util.Scanner;
public class MedicalCause
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether the student is aloowed to sit in exam or not");
        System.out.println("Enter the number of classes held");
        double a=sc.nextDouble();
        System.out.println("Number of classes attended");
        double b=sc.nextDouble();
        double p=(b/a)*100;
        if(p<75){
            System.out.println("Do you have any medical cause?");
            System.out.println("Enter 'Y' if yes and 'N' if no");
            char answer=sc.next().charAt(0);
            switch(answer){
                case 'y':
                case 'Y':
                    System.out.println("Your attendence is "+p+" because you have medical problem so you are allowed to sit in exam.");
                    break;
                case 'n':
                case 'N':
                    System.out.println("Your attendence is "+p+" also you have no medical cause so you are not allowed to sit in the exam.");
                    break;
                default:
                    System.out.println("Your attendence is "+p+" so you is not allowed to sit in exam.");
            }
        }else if(p>=75 && p<=100){
                System.out.println("Your attendence is "+p+" so you are allowed to sit in the exam.");
        }else{
            System.out.print("Wrong input");
        }
    }
}