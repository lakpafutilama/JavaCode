import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal, rate and time respectively");
        Interest si=new Interest(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Principal= "+si.getPrincipal());
        System.out.println("Rate= "+si.getRate());
        System.out.println("Time= "+si.getTime());
        System.out.println("The simple interest is "+si.getSi());
        System.out.println("The simple interest is "+si.getSi());
    }
}