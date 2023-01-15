/**
 * Write a Java program that reads in two integer numbers and tests whether they are the same up to n position
 starting from the least position, n input by user.
Test Data
Input integer number: 123424256
Input integer another number: 3256
value of n: 3
Expected Output :
They are same
 *
 * @author (Lakpa Futi Lama)
 * @version (31)
 */
import java.util.Scanner;
public class nLeastdec_Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to test whether two inputed integer");
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter another number");
        int b=sc.nextInt();
        System.out.println("Enter the position from least place");
        int n=sc.nextInt();
        int d=1;
        for(int i=1; i<=n; i++){
            d=d*10;
        }
        int e=a%d;
        int f=b%d;
        System.out.println(e);
        System.out.println(f);
        if(e==f){
            System.out.println("They are same");
        }else{
            System.out.println("They are different");
        }
    }
}
