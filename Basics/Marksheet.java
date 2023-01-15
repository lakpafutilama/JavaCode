import java.util.Scanner;
public class Marksheet
{
public static void main(String[]args)
    {
float s1,s2,s3,total,per;
        Scanner sc= new Scanner(System.in);
System.out.println("Enter marks of 1st subject: ");
        s1=sc.nextFloat();
System.out.println("Enter marks of 2nd subject: ");
        s2=sc.nextFloat();
System.out.println("Enter marks of 3rd subject: ");
        s3=sc.nextFloat();
System.out.println("Result");
total=s1+s2+s3;
System.out.println("Total marks of 3subject: "+total);
float percent=(total/300)*100;
System.out.println("Percentage: "+percent+"%");
    }
}