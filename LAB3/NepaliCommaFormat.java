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
public class NepaliCommaFormat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that displays the amount entered by user in nepali money format");
        System.out.println("Enter the amount");
        long a=sc.nextLong();
        long c=0;
        String m="";
        for(int i=0; i<3; i++){
            c=a%10;
            m+=c;
            a=a/10;
        }
        StringBuffer sb = new StringBuffer(m);
        String n= sb.reverse().toString();
        DecimalFormat df= new DecimalFormat("##,##");
        String df1=df.format(a);
        String df2=df1+","+n;
        System.out.println(df2);
    }
}