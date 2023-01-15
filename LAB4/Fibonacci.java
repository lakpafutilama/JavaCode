/**
 * Write a description of class Square here.
 *
 * @author (Lakpa Futi Lama)
 * @version ()
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number in sequence");
        int n=sc.nextInt();
        int f=findFibonacci(n);
        System.out.println(f);
    }

    public static int findFibonacci(int x)
    {
        if(x==1){
            return 0;
        }
        if(x==2){
            return 1;
        }
        return findFibonacci(x-2)+findFibonacci(x-1);
    }
}