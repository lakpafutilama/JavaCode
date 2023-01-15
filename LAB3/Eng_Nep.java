/**
 * Write a generalized program for question 21 that takes format as another input (e for English, n for nepali),
 and display the money format as per user choice.
input: 1242342
format: e
output: 124,342
 *
 * @author (Lakpa Futi Lama)
 * @version (28)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Eng_Nep
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A program to change the money format from user");
        System.out.println("Enter the amount");
        long n=sc.nextLong();
        System.out.println("Format 'e for English, n for nepali'");
        char ch=sc.next().charAt(0);
        long a=0;
        String s="";
        if(ch=='e'){
            DecimalFormat fe=new DecimalFormat("$ ###,###");
            String e=fe.format(n);
            System.out.println(e);
        }
        else if(ch=='n'){
            for(int i=0; i<3; i++){
                a=n%10;
                s+=a;
                n=n/10;
            }
            DecimalFormat fn=new DecimalFormat("Rs ##,##");
            String ne=fn.format(n)+","+s;
            System.out.println(ne);
        }
        else{
            System.out.println("Wrong choice");
        }
    }
}