/**Write a program to input the annual income from user and compute the tax according to the given conditions and display the total tax:
Total Annual Taxable Income Tax Rate
Upto Rs.1,00,000 No tax
From 1,00,001 to 1,50,000 10% of the income exceeding Rs.1,00,000
From 1,50,000 to 2,50,000 Rs.5000 +20% of the income exceeding Rs.1,50,000
Above Rs.2,50,000 Rs.25,000 +30% of the income exceeding Rs.2,50,000
 * @author (Lakpa Futi Lama)
 * @version (7)
 */ 
import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to compute the Tax of annual income");
        System.out.println("Enter the income");
        double i=sc.nextDouble();
        double tax;
        if (i<=100000)
            System.out.printf("No tax needed to pay");
        else if(i>100000 && i<=150000){
            tax=0.1*(i-100000);
            System.out.printf("The total tax for Rs.%f is Rs.%f.",i,tax);
        }else if(i>150000 && i<=250000){
            tax=5000+(0.2*(i-150000));
            System.out.printf("The total tax for Rs.%f is Rs.%f.",i,tax);
        }else{
            tax=25000+(0.3*(i-250000));
            System.out.printf("The total tax for Rs.%f is Rs.%f.",i,tax);
        }
    }
}