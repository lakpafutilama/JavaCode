import java.util.Scanner;
    public class palindrome
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("A program to check if the number is palindrome or not");
            System.out.println("Enter the value of x");
            int x = sc.nextInt();
            int a = x%10;
            int b = x/10;
            int c = b%10;
            int d = b/10;
            int rev= a*100+c*10+d*1;
            if(x==rev)
            {
                System.out.println("The given number " +x+ " is palindrome.");
            }
            else if(x!=rev)
            {
                System.out.println("The given number " +x+ " is not palindrome.");
            }
        }
    }