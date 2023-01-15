/**
 * Write a Java method to compute the average of three numbers.
 Test Data:
 Input the first number: 25
 Input the second number: 45
 Input the third number: 65
 Expected Output
 The average value is 45.0
 *
 * @author (Lakpa Futi Lama)
 * @version (4)
 */
public class Average
{
    public static void main(String[] args)
    {
        int a=25, b=45, c=65;
        double ave=findAverage(a,b,c);
        System.out.println("The average is "+ave);
    }
    
    public static double findAverage(int a, int b, int c)
    {
        double av=(a+b+c)/3.0;
        return av;
    }
}