import java.util.Scanner;
public class Details{
public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
System.out.println("Name");
        String Name= sc.next();
System.out.println("Roll no.");
        String Roll= sc.next();
System.out.println("Hobby");
        String i= sc.next();
System.out.print("Hey,My name is " +Name);
System.out.print(" and My roll number is " +Roll);
System.out.print(". My field of interest is " +i);
    }
}
