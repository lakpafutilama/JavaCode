/**
 * Write a program that displays the amount entered by user in nepali money format.
Example:
input: 1242342
output: 1,24,342
 *
 * @author (Lakpa Futi Lama)
 * @version (20)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class NepaliComma
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that displays the amount entered by user in nepali money format");
        System.out.println("Enter the amount");
        int a=sc.nextInt();
        String n="##,##";
        int p=a%10;//2
        int q=a/10;//124234
        int r=q%10;//4
        int s=q/10;//12423
        int t=s%10;//3
        int u=s/10;///1242
        DecimalFormat df= new DecimalFormat(n);
        String b=df.format(u)+","+t+r+p;
        System.out.println("Rs."+b);
    }
}