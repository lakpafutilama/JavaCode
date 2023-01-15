/**
 * Write a program to test if the character input by user is upper case or lower case or other character.
 * @author(Lakpa Futi Lama)
 * @version (5)
 */
import java.util.Scanner;
public class CaseCheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to test whether the character is upper case or lower case or other character");
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        System.out.printf("The given character %c is in upper case.",ch);
        else if(ch>='a' && ch<='z')
        System.out.printf("The given character %c is in lower case.",ch);
        else
        System.out.printf("%c is other character.",ch);
    }
}