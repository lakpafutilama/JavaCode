import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of 1st side'a'");
    int a = sc.nextInt();
    System.out.println("Enter the value of 2nd side'b'");
    int b = sc.nextInt();
    System.out.println("Enter the value of 3rd side'c'");
    int c = sc.nextInt();
    int perimeter = a+b+c;
    System.out.println("The perimeter of triangle is " +perimeter);
    int s = perimeter/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("The area of triangle is " +area);
}
}
    
    