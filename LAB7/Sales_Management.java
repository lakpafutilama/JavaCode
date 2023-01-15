import java.util.Scanner;

public class Sales_Management
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of store");
        int n=sc.nextInt();
        int []s=new int[n];
        int sum=0;
        int  a=0;
        for(int i=0; i<n; i++)
        {
           System.out.print("Enter Today sales for store "+(i+1)+": ");
           s[i]=sc.nextInt();
           sum+=s[i];
           System.out.println();
        }
        System.out.println("Sales Bar Chart");
        for(int i=0; i<n; i++)
        {
            a=0;
            System.out.printf("Store %d:",(i+1));
            a=s[i]/500;
            for(int j=0; j<a; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        double p=0;
        System.out.println("Percentage of sales");
        for(int i=0; i<n; i++)
        {
            System.out.printf("Store %d:",(i+1));
            p=(s[i]*100)/sum;
            System.out.printf("%.2f%% \n",p);
        }
        
    }
}