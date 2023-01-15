/**
Write a Java program to solve quadratic equations (use if, else if and else).
Hint: The equation is ax2 + bx + c=0, Take a, b, c as input from user.There are three nature of root of a 
quadratic equation.
imaginary, real and equal, real and unequal. Write complete code for all possible cases.
In case of imaginary number display the roots are imaginary (you need not calculate the root).
Hint: x1,x2=−b𝑏±√𝑏2−4𝑎𝑐2𝑎, b2-4ac is called determinant of the root
a. if b2<4ac roots are imaginary  + 2 dis real number - neither 
b. else if b2>4ac roots are real  repeated 
 * @author (Lakpa Futi Lama)
 * @version (21)
 */
import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to solve quadratic equation");
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();
        System.out.println("Enter c");
        double c=sc.nextDouble();
        double det=(b*b)-(4*a*c);
        if (det>0){
            double x1=((-b)-Math.sqrt(det))/(2.0*a);
            double x2=((-b)+Math.sqrt(det))/(2.0*a);
            System.out.println("The determinant is positive so it has two real roots. They are: "+x1+" and "+x2);
        }else if(det<0){
            System.out.println("The determinant is negative so it has imaginary roots.");
        }else{ //det==0
            double x=(-b)/(2*a);
            System.out.println("The determination is zero so it has repeated real number i.e. "+x);
        }
    }
}