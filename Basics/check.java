import java.util.Scanner;
    public class check
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("A program to check if the input is even and divisible or not ");
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            int x=a%2;
            int r=a%5;
            if(x==0&&r==0)
            {
                System.out.println("The number is both even and divisible by 5");
            }
            else{
                System.out.println("The number isnot both even and divisible by 5");
            }
        }
    }