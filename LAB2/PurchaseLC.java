/**
 * An electronics shop has announced the following seasonal discounts on the purchase of certain items.
Purchase Amount in Rs. Discount on Laptops Discount on Desktop PC0%
Write a program based on the above criteria, to the purchase amount and the type of purchase, L for laptop 
and D for desktop by a customer. Compute and print the net amount to be paid by a customer.
Formula:
discount = (discount rate/100) * amount of purchase
net amount = amount of purchase – discount

 * @author (Lakpa Futi Lama)
 * @version (9)
 */
import java.util.Scanner;
public class PurchaseLC
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to purchase seasonal discount");
        System.out.println("Enter the purchase amount");
        double p=sc.nextDouble();
        System.out.println("Enter your choice\n 'L' for laptop and 'D' for desktop");
        char ch=sc.next().charAt(0);
        double a, d;
        switch(ch){
            case 'D':
            case 'd':
                if(p>0 && p<=25000){
                    d=0.05*p;
                    a=p-d;
                }else if(p>25000 && p<=57000){
                    d=0.75*p;
                    a=p-d;
                }else if(p>57000 && p<=100000){
                    d=0.1*p;
                    a=p-d;
                }else{
                    d=0.15*p;
                    a=p-d;
                }
                System.out.println("The net amount of desktop is Rs."+a+" with discount Rs."+d);
                break;
            case 'L':
            case 'l':
                if(p>0 && p<=25000){
                    d=0;
                    a=(p-d);
                }else if(p>25000 && p<=57000){
                    d=0.5*p;
                    a=p-d;
                }else if(p>57000 && p<=100000){
                    d=0.75*p;
                    a=p-d;
                }else{
                    d=0.1*p;
                    a=p-d;
                }
                System.out.println("The net amount of laptop is Rs."+a+" with discount Rs."+d);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}