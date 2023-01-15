/**
 * Write a generalize program for Q20 by asking the format of money from user (e for English and n for Nepali) and 
displaying formatted output accordingly.
input: 1242342
format: n
output: !@,$@,#$@
 *
 * @author (Lakpa Futi Lama)
 * @version (21)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class NepEng_Format
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        DecimalFormat dfe=new DecimalFormat("$ ###,###");
        DecimalFormat dfn=new DecimalFormat("रु ##,##");
        System.out.println("A program to print money format(e for English and n for Nepali)");
        System.out.println("Enter the amount");
        long a=sc.nextLong();
        long b=0;
        String n="";
        System.out.println("Enter the 'e' for english format and 'n' for nepali format");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'e':
            case 'E':
                String df1=dfe.format(a);
                System.out.println(df1);
                break;
            case 'n':
            case 'N':
                for(int i=0; i<3; i++){
                    b=a%10;
                    n=n+b;
                    a=a/10;
                }
                StringBuffer sb= new StringBuffer(n);
                String t=sb.reverse().toString();
                String df2=dfn.format(a)+","+t;
                String z="";
                int diff='1'-'१';
                for(int i=0; i<df2.length(); i++){
                    char che=df2.charAt(i);
                    if(che>='0' && che<='9'){
                        z+=(char)(che-diff);
                    }
                    else{
                        z+=che;
                    }
                }
                System.out.print(z);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}