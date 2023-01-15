import java.util.Scanner;
public class S_detail
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Students ss=new Students();
        System.out.println("Enter name, age and roll number");
        ss.InitializeStudent(sc.nextLine(), sc.nextInt(), sc.nextInt());
        ss.printData();
    }
}
