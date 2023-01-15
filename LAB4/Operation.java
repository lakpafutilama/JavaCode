/**
 * Write a method named operation that takes two integer arguments and a char argument, perform the calculation as per the char argument,
and return the result:
Example: operation(2,5,’+’) should return 10 as result.
 *
 * @author (Lakpa Futi Lama)
 * @version (17)
 */
import java.util.Scanner;
public class Operation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method that takes two integer arguments & a char argument, perform calculation as per the char argument");
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("Enter operation");
        char ch=sc.next().charAt(0);
        calculate(a,b,ch);
    }

    public static void calculate(int x, int y, char z)
    {
        if(z=='+'){
            System.out.println(x+y);
        }else if(z=='-'){
            System.out.println(x-y);
        }else if(z=='*'){
            System.out.println(x*y);
        }else if(z=='/'){
            System.out.println(x/y);
        }else if(z=='%'){
            System.out.println(x%y);
        }else if(z=='^'){
            System.out.println(x^y);
        }else{
            System.out.println("Invalid operation"); 
        }
    }
}