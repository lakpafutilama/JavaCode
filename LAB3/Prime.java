/**
 * Write a program to check whether a number input by user is prime or not. 
 *
 * @author (Lakpa Futi Lama)
 * @version (16)
 */
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether a number input by user is prime or not");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean prime;
        if(n<2){
            prime=false;
        }else{
            prime=true;
        }
        for (int i=2; i<n; i++){
            int p=n%i;
            if (p==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println(n+" is prime number.");
        }else{
            System.out.println(n+" is not prime number.");                
        }
    }
}