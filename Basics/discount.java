//Write a program based on above criteria to the purchase amount and the type of purchase , L for laptop and D for desktop by a customer.
//Compute and print the net amount to be paid by a customer.
import java.util.Scanner;
public class discount{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to purchase seasonal discount");
        System.out.println("What do you want to buy?");
        System.out.println("Enter 'l' for laptop and 'd' for desktop PC");
        char choice=sc.next().charAt(0);
        double l,d;
        
        if (choice=='l')
        {
            System.out.println("Enter the purchase amount of laptop");
            double p=sc.nextDouble();
            double a;
            if(p>0 && p<=25000){
                a=p;}
            else if(p>25000 && p<=57000){
                a=p-(0.05*p);}
            else if(p<=100000){
                a=p-(0.075*p);}
            else if(p>100000){
                a=p-(0.1*p);
            }
                System.out.printf("The net amount to be paid by a customer is Rs.%d",a);
        }
        else if(choice=='d')
        {
            System.out.println("Enter the purchase amount of desktop PC");
            double p=sc.nextInt();
            double A;
            if(p>0 && p<=25000){
                A=p-(0.05*p);}
            else if(p>25000 && p<=57000){
                A=p-(0.075*p);}
            else if(p<=100000){
                A=p-(0.1*p);}
            else if(p>100000){
                A=p-(0.15*p);
                System.out.println("The net amount to be paid by a customer is Rs."+A+" for desktop PC.");}
        }
        else
        {
        System.out.println("error");
        }
    }
}