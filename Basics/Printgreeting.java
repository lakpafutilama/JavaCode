import java.util.Scanner;
public class Printgreeting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.printf ("Welcome\n") ;
        }
        else if(n==1)
        {
            System.out.printf("Hello\n");
        }
        else if(n==2)
        {
            System.out.printf("Have a nice day\n");
        }
        else if(n==3)
        {
            System.out.printf("Thank you\n");
        }
        else
        {
            System.out.printf("wrong input");
        }
    }
}
