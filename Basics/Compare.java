import java.util.Scanner;
public class Compare
{
public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter a ");
int a= sc.nextInt();
System.out.println("Enter b");
int b= sc.nextInt();
boolean c= a<50;
boolean d= a<b;
System.out.println("The statement a<50 is " +c);
System.out.println("The statement a<b is " +d);
    }
}

