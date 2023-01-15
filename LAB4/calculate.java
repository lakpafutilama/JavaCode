/**
 * Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Formula for calculation of future amount= p*(1+𝑟𝑛)𝑛𝑡 ,n is number of time interest is calculated per unit time t, r is rate in
decimal.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5
Expected Output:
Years FutureValue
1 1104.71
2 1220.39
3 1348.18
4 1489.35
5 1645.31
 *
 * @author (Lakpa FutiLama)
 * @version (9)
 */
import java.util.Scanner;
public class calculate
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double p=1000, r=0.1;
        double t=sc.nextInt();
        String a=futureInterest(p,r,t);
        System.out.println(a);
    }

    public static String futureInterest(double p, double r, double t)
    {
        double a=0;
        String s="";
        for(int i=1; i<=t; i++)
        {
            a=p*Math.pow((1+r/12),(12*t));
            s+=a+"\n";
        }
        return s;
    }
}