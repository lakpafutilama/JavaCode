/**
Write a program to compute the area of a:
i. Rectangle (length * breadth)
ii. Circle ( p * r2), use standard value for p
iii. Square (side * side)
Display a menu to output the area as per the user’s choice
* @author (Lakpa Futi Lama)
* @version (10)
*/
import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to print area");
        System.out.println("Choose 'r'for rectangle, 'c' for circle and 's' for square");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'r':
            case 'R':
            System.out.println("Enter the length");
            double l=sc.nextDouble();
            System.out.println("Enter the breadth");
            double b=sc.nextDouble();
            double area=l*b;
            System.out.printf("The area is %fcm^2.",area);
            break;
            case 'c':
            case 'C':
            System.out.println("Enter the radius");
            double r=sc.nextDouble();
            double area2=(22/7)*r*r;
            System.out.printf("The area is %fcm^2.",area2);
            break;
            case 's':
            case 'S':
            System.out.println("Enter the side");
            double s=sc.nextDouble();
            double area3=s*s;
            System.out.printf("The area is %fcm^2.",area3);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}