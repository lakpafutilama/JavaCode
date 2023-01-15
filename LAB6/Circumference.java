import java.util.Scanner;
public class Circumference
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Circle c=new Circle();
        System.out.println("Enter radius");
        Circle c=new Circle(sc.nextInt());
        System.out.println(c.getCircumference());
    }
}