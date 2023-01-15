import java.util.Scanner;
public class Transaction
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //BankAccount ba=new BankAccount();
        System.out.println("Enter name, account number, account type and amount respectively");
        BankAccount ba=new BankAccount(sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextInt());
        System.out.println("Welcome to our Bank");
        int e=7;
        while (e!=0)
        {
            System.out.println();
            System.out.println("Enter 1 to display name and balance");
            System.out.println("Enter 2 to deposit amount");
            System.out.println("Enter 3 to withdraw amount");
            System.out.println("Enter 0 to exit");
            e=sc.nextInt();
            if(e==1)
            {
                String s=ba.displayNB();
                System.out.println(s);
            }
            else if(e==2)
            {
                int d=sc.nextInt();
                ba.setAmount(d);
            }
            else if(e==3)
            {
                int w=sc.nextInt();
                ba.setAmount(-w);
            }
            else if(e==0)
            {
                
            }
            else
            {
                System.out.println("Wrong input");
            }
        }
    }
}
