import java.util.Scanner;
public class NetLaptopPC
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount for laptop or desktop.");
        double amount=sc.nextDouble();
        System.out.println("Enter 'd' for desktop and 'l' for laptop.");
        double net=0,discount=0;
        boolean flag=true;
        while(flag)
        {
            char type=sc.next().charAt(0);
            if(type=='l')
            {
                flag=false;
                if(amount>0 && amount<=30000)
                {
                    net=amount;
                }
                else if(amount>30000 && amount <=49000)
                {
                    discount=(8.0/100)*amount;
                    net=amount-discount;
                }
                else if(amount>49000 && amount <=95000)
                {
                    discount=(9.5/100)*amount;
                    net=amount-discount;
                }
                else if(amount>95000)
                {
                    discount=(12.0/100)*amount;
                    net=amount-discount;
                }
            }
            else if(type=='d')
            {
                flag=false;
                if(amount>0 && amount<=30000)
                {
                    discount=(5.0/100)*amount;
                    net=amount;
                }
                else if(amount>30000 && amount <=49000)
                {
                    discount=(9.5/100)*amount;
                    net=amount-discount;
                }
                else if(amount>49000 && amount <=95000)
                {
                    discount=(12.0/100)*amount;
                    net=amount-discount;
                }
                else if(amount>95000)
                {
                    discount=(15.0/100)*amount;
                    net=amount-discount;
                }
            }
            else
            {
                System.out.println("Enter either d or l for the purchase type.");
            }
        }
        System.out.println("The net amount to be paid is "+net+"IC" +" with discount " +discount+" IC");
    }
}