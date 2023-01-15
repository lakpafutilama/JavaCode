/**
 * Write a program to count the number of upper case, lower case, digit and character from a string
that is taken as input from user.
 *
 * @author (Lakpa Futi Lama)
 * @version (18)
 */
import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to count the number of upper case, lower case, digit and character from a string");
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int u=0, l=0, n=0, c=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (ch>='a' && ch<='z'){
                l++;
            }
            else if(ch>='A' && ch<='Z'){
                u++;
            }else if(ch>='0' && ch<='9'){
                n++;
            }else{
                c++;
            }
        }
        System.out.println("Upper case="+u);
        System.out.println("Lower case="+l);
        System.out.println("Digit="+n);
        System.out.println("Special character="+c);
    }
}