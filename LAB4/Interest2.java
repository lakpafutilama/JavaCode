import java.text.DecimalFormat;

/**
 * Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
 Formula for calculation of future amount= p*(1+𝑟𝑛)𝑛𝑡 , is number of time interest is calculated per unit time t, r is rate in
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
 * @author (Lakpa Futi Lama)
 * @version (9)
 */
public class Interest2
{
    public static void main(String[] args)
    {
        double p=1000, r=0.1;
        double t=5;
        String a=futureInterest(p,r,t);
        System.out.println(a);
    }

    public static String futureInterest(double p, double r, double t)
    {
        String s="";
        String z="";
        for(int i=1; i<=t; i++)
        {
            double b=0;
            double a=p*Math.pow((1+r/12),(12*i));
            b+=a;
            DecimalFormat df=new DecimalFormat("#.##");
            s+=b+"\n";
            z=df.format(s);
        }
        return z;
    }
}