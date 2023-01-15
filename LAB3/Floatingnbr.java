/**
 * Write a program that takes two input from user: a floating point digit and a precision, and round off and
 display the number to that precision.
Example:
input 13.3574 2
output: 13.36
 *
 * @author (Lakpa Futi Lama)
 * @version (19)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Floatingnbr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that takes a floating point digit and a precision, and round off");
        System.out.println("Enter the floating number");
        float n=sc.nextFloat();
        System.out.println("Enter the precision");
        int p=sc.nextInt();
        String a="#.";
        for(int i=0; i<p; i++){
            a+="#";
        }
        DecimalFormat df= new DecimalFormat(a);
        String df1= df.format(n);
        System.out.println(df1);
    }
}
