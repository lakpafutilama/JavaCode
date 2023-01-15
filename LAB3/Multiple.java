/**
 * Write a program in Java to display the multiplication table of a given integer up to 10.
Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25...
 *
 * @author (Lakpa Futi Lama)
 * @version (6)
 */
import java.util.Scanner;
public class Multiple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A  program to display the multiplication table of a given integer up to 10.");
        System.out.println("Display multiple of number");
        int n=sc.nextInt();
        int i=0;
        int m=0;
        while (i<=10){
            m=i*n;
            System.out.printf("%d * %d = %d%n",n,i,m);
            i++;
        }
    }
}