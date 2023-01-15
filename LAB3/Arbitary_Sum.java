/**
 * Write a program that inputs arbitrary positive number from user and prints their sum.
 Program ends when the input from user is negative.
 *
 * @author (Lakpa Futi Lama)
 * @version (24)
 */
import java.util.Scanner;
public class Arbitary_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that inputs arbitrary positive number from user and prints their sum");
        int b=0;
        while(true){
            System.out.println("Enter the positive number");
            int a=sc.nextInt();
            if(a<0){
                System.out.println("Sorry the inputed number is negative.");
                break;
            }else{
                b=b+a;
                System.out.println("The sum is "+b);
            }
        }
    }
}