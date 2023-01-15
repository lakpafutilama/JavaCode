import java.util.Scanner;
public class IncomeTax
{
    public static void main(String arhs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int s=sc.nextInt();
        float t=0;
        if(s<250000)
            t+=0;
        else if(s>=250000 && s<500000)
            t+=(5/100)*(s-250000);
        else if(s>=500000 && s<1000000)
            t+=(20/100)*(s-500000);
        else
            t+=(30/100)*(s-1000000);
        System.out.println("The tax is "+t);
    }
}