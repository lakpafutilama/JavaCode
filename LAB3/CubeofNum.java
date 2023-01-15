/**
 * Write a program in Java to display the cube of the number up to given an integer.
Test Data
Input number of terms : 4
Expected Output :
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
 *
 * @author (Lakpa Futi Lama)
 * @version (5)
 */
import java.util.Scanner;
public class CubeofNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to display the cube of the number up to given an integer");
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int cube=(int)Math.pow(i,3);
            System.out.printf("The cube of %d is %d.%n",i,cube);
        }
    }
}