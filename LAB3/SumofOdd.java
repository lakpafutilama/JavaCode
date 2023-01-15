/**
 * Write a program in Java to display the n terms of odd natural number and their sum.
Test Data
Input number of terms is: 5
Expected Output :
The odd numbers are :
1
3
5
7
9
The Sum of odd Natural Number upto 5 terms is: 25
 *
 * @author (Lakpa Futi Lama)
 * @version (7)
 */
import java.util.Scanner;
public class SumofOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to display the n terms of odd natural number and their sum.");
        System.out.println("Enter the number of term");
        int n=sc.nextInt();
        int j=1, sum=0;
        for(int i=1; i<=n; i++){
            System.out.println(j);
            sum=sum+j;
            j=j+2;
        }
        System.out.printf("The sum of odd natural number upto %d terms is %d.",n,sum);
    }
}