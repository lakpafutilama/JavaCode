/**
 * Write a program to input the three sides of triangle and check if the sides of triangle are valid or not.
 * If the triangle is valid, print its type (scalene, isosceles, equilateral)
 *
 * @author (Lakpa Futi Lama)
 * @version (31)
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check if the sides of triangle are valid and print its type");
        System.out.println("Enter the first side");
        int a=sc.nextInt();
        System.out.println("Enter the second side");
        int b=sc.nextInt();
        System.out.println("Enter the third side");
        int c=sc.nextInt();
        if(a>0  && b>0 && c>0){
            if(a==b && b==c && c==a){
                System.out.println("It is Equilateral triangle.");
            }else if(a==b || b==c || c==a){
                System.out.println("It is Isosceles triangle.");
            }else{
                System.out.println("It is Scalene triangle.");
            }
        }else{
            System.out.println("Sides of triangle are not valid.");
        }
    }
}