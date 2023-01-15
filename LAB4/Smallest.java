/**
 * Write a Java method to find the smallest number among three numbers.
 Test Data:
 Input the first number: 25
 Input the Second number: 37
 Input the third number: 29
 Expected Output:
 The smallest value is 25.
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
import java.util.Scanner;
public class Smallest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        int s=findSmallest(a,b,c);
        System.out.printf("The smallest value is %d.",s);
    }
    
    public static int findSmallest(int a, int b, int c)
    {
        if(a<=b && a<=c){
            return a;
        }else if(b<=a && b<=c){
            return b;
        }else{
            return c;
        }
    }
}