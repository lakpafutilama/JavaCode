/**
 * Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Expected Output:
1. A password must have at least ten characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
Password is valid: abcd1234
 *
 * @author (Lakpa Futi Lama)
 * @version (12)
 */
import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A Java method to check whether a string is a valid password");
        System.out.println("A password must have at least ten characters");
        System.out.println("A password consists of only letters and digits");
        System.out.println("A password must contain at least two digits");
        System.out.println("Enter the password");
        String s=sc.nextLine();
        checkPassword(s);
    }

    public static void checkPassword(String x)
    {
        int d=0, l=0;
        if(x.length()>=10){
            for(int i=0; i<x.length(); i++){
                char ch=x.charAt(i);
                if(ch>='0' && ch<='9'){
                    d++;
                }
            }
            if(d>=2){
                for(int i=0; i<x.length(); i++){
                    char ch=x.charAt(i);
                    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                        l++;
                    }
                }
            }
        }
        if(x.length()==l){
            System.out.println("Valid password type");
        }
        else{
            System.out.println("Invalid password type");
        }
    }
}