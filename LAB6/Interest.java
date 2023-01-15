/**
 * Write a program that implements Interest class which stores three variables principal, rate and time and calculates simple interest.
 Create parameterized constructor to initialize the variables. Also define getters and setter for all variable.
 Write main method to test the class.
 *
 * @author (Lakpa Futi Lama)
 * @version (2)
 */
public class Interest
{
    private double p;
    private int r;
    private int t;
    
    public Interest(int a, int b, int c)
    {
        p=a;
        r=b;
        t=c;
    }
    
    public void setPrincipal(int x)
    {
        p=x;
    }
    
    public void setRate(int y)
    {
        r=y;
    }
    
    public void setTime(int z)
    {
        t=z;
    }
    
    public double getPrincipal()
    {
        return p;
    }
    
    public int getRate()
    {
        return r;
    }
    
    public int getTime()
    {
        return t;
    }
    
    public double getSi()
    {
        return (p*t*r)/100;
    }
}
