import java.util.Scanner;
public class swap_sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        int c=(a+b)-a;
        int d=(a+b)-b;
        System.out.println("a="+c);
        System.out.println("b="+d);
    }
}