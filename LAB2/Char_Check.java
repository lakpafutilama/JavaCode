/**
 *Write a program to find whether a given character is a digit or a letter. Test your program.
 * @author (Lakpa futi Lama)
 * @version (12)
 */
import java.util.Scanner;
public class Char_Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to check whether the given character is digit or letter");
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        System.out.printf("The given character %c is letter.",ch);
        else if (ch>='0' && ch<='9')
        System.out.printf("The given character %c is digit.",ch);
        else
        System.out.printf("The given character %c is neither digit nor letter.",ch);
    }
}