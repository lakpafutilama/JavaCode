/**Write a program that checks if the number input by user is both even and divisible by 5 or not and display message accordingly.
 * @author (Lakpa Futi Lama)
 * @version (4)
 */
import java.util.Scanner;
public class EODF
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to check if number is both even and divisible by 5 or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n%5==0)
            if (n%2==0)
                System.out.printf("The given number %d is both even and divisible by five.",n);
            else
                System.out.printf("The given number %d is not even but divisible by five.",n);
        else
        if (n%2==0)
            System.out.printf("The given number %d is even but not divisible by five.",n);
        else
            System.out.printf("The given number %d is neither even nor divisible by five.",n);
    }
}