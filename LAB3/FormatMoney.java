import java.util.Scanner;
import java.text.DecimalFormat;
public class FormatMoney
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        System.out.println("Type 'e' for english and 'n' for Nepali");
        char ch=sc.next().charAt(0);
        int diff='1'-'१';
        long b=0,c=0,m=0;
        String s="";
        if(ch=='n')
        {
            for(int i=0;i<3;i++)
            {
                c=n%10;
                s+=c;
                n=n/10;
            }
            StringBuffer sb=new StringBuffer(s);
            String st=sb.reverse().toString();
            DecimalFormat df=new DecimalFormat("रु ##,##");
            String df1=df.format(n)+","+st;
            String ns="";
            for(int i=0;i<df1.length();i++)
            {
                char ca=df1.charAt(i);
                if(ca>='0' && ca<='9')
                {
                    ns+=(char)(ca-diff);
                }
                else
                {
                    ns+=ca;
                }
            }
            System.out.println(ns);
        }
        else if(ch=='e')
        {
            DecimalFormat df2=new DecimalFormat("$ ###,###");
            String df3=df2.format(n);
            System.out.println(df3);
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}