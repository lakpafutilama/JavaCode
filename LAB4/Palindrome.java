/**
 * Write a method that takes an integer as argument and checks if the number is palindrome or not.The method should return 
 true if the number is palindrome or false if not. Write a main method to check the method you have created.
 *
 * @author (Lakpa Futi Lama)
 * @version (16)
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method that checks if the number is palindrome or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(check(n));
    }

    public static boolean check(int a)
    {
        int p=0;
        int c=a;
        while(a!=0){
            int b=a%10;
            p=p*10+b;
            a=a/10;
        }
        boolean flag;
        if(c==p){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
}