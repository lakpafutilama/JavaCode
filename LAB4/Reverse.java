/**
 * Write a method that reverses the string passed as argument.
 *
 * @author (Lakpa Futi Lama)
 * @version (19)
 */
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method that reverses the string passed as argument");
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(revString(s));
    }
    
    public static String revString(String x)
    {
        String a="";
        for(int i=x.length()-1; i>=0; i--){
            char ch=x.charAt(i);
            a+=ch+"";
        }
        return a;
    }
}
