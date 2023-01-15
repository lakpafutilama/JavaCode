/**Write a program to check whether the 3-digit number input by user is palindrome or not.
Example: 232 is palindrome since the number is same from forward and reverse direction
* @author (Lakpa futi Lama)
* @version (15)
*/
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether the input number is palindrome or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=n%10;
        int b=n/10;
        int c=b%10;
        int d=b/10;
        int r=a*100+c*10+d;
        if(n==r)
        System.out.printf("The given number %d is palindrome.",n);
        else
        System.out.printf("The given number %d is not palindrome.",n);
    }
}