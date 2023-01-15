/**
 * Write a program that uses the function power() to raise a number m to power n. The function takes integer values for m and n and 
returns the result correctly. Use a default value of 2 for n to make the function calculate squares when this argument is omitted.
Write a function main() to pass the value of m and n and display the calculated result.
 *
 * @author (Lakpa Futi Lama)
 * @version (18)
 */
import java.util.Scanner;
public class SquareofNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to calculate squares");
        System.out.println("Enter A to enter single number and B to enter two number");
        char ch=sc.next().charAt(0);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(ch=='a' || ch=='A'){
            int a=changeX(n);
            System.out.println(a);
        }else if(ch=='b' || ch=='B'){
            System.out.println("Power of:");
            int p=sc.nextInt();
            int b=changeX(n,p);
            System.out.println(b);
        }else{
            System.out.println("Wrong input");
        }
    }

    public static int changeX(int x)
    {
        return (int)(Math.pow(x,2));
    }

    public static int changeX(int x, int y)
    {
        return (int)(Math.pow(x,y));
    }
}