/**
 *Declare and initialize three integer variables x, y and z as 15, 2 and 8. Arrange and print the variables in ascending order.
 * @author (Lakpa Futi Lama)
 * @version (11)
 */
import java.util.Scanner;
public class AscendingOrder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to arrange given number in ascending order");
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if (a<=b && b<=c)
            System.out.printf("The ascending order of given number is %d, %d, %d.",a,b,c);
        else if(a<=c && c<=b)
            System.out.printf("The ascending order of given number is %d, %d, %d.",a,c,b);
        else if(b<=a && a<=c)
            System.out.printf("The ascending order of given number is %d, %d, %d.",b,a,c);
        else if(b<=c && c<=a)
            System.out.printf("The ascending order of given number is %d, %d, %d.",b,c,a);
        else if(c<=a && a<=b)
            System.out.printf("The ascending order of given number is %d, %d, %d.",c,a,b);
        else
            System.out.printf("The ascending order of given number is %d, %d, %d.",c,b,a);
    }
}