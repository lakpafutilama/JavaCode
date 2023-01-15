/**
 * Write a Java method to count all words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
 *
 * @author (Lakpa Futi Lama)
 * @version (7)
 */
import java.util.Scanner;
public class Words
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to count all words in a string");
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("There are "+countWord(s)+" words in given string");
    }

    public static int countWord(String x)
    {
        int k=1;
        for(int i=0; i<x.length(); i++)
        {
            char ch=x.charAt(i);
            if(ch==' ')
            {
                k++;
            }
        }
        return k;
    }
}