/**
 * Write a program to check whether a number input by user is Armstrong or not.
153=13+53+33
 *
 * @author (Lakpa Futi Lama)
 * @version (17)
 */
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether a number input by user is Armstrong or not.");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int m=n;
        int sum=0, a, b=1, p=0;
        while(b<n){
            b=b*10;
            p++;
        }
        while(m>0){
            a=m%10;
            sum=sum+(int)Math.pow(a,p);
            m=m/10;
        }
        if(n==sum){
            System.out.println(n+" is armstrong number.");
        }else{
            System.out.println(n+" is armstrong number.");
        }
    }
}