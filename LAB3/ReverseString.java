import java.util.Scanner;
public class ReverseString
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        System. out. println("Enter a string to reverse"); 
        String s=sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        String str= sb.reverse().toString();
        System.out.println(str);
    }
}