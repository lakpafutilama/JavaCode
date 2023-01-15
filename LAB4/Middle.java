/**
 *  Write a Java method to display the middle character of a string.
Note: a) If the length of the string is even there will be two middle characters.
      b) If the length of the string is odd there will be one middle character.
 Test Data:
 Input a string: 350
 Expected Output:                                                                         
 The middle character in the string: 5
 *
 * @author (Lakpa Futi Lama)
 * @version (5)
 */
import java.util.Scanner;
public class Middle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to display the middle character of a string");
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(findMd(s));
    }
    
    public static String findMd(String x)
    {
        int l=x.length();
        int a=l/2;
        if(l%2==0)
        {
             char ch=x.charAt(a-1);
             char ch2=x.charAt(a);
             return ch+""+ch2;
        }
        else
        {
            char ch=x.charAt(a);
            return ch+"";
        }
    }
}
