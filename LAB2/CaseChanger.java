/**Write a program to convert the case of character input by user. For example, if the user inputs character ‘x’, output must be ‘X’
 * @author (Lakpa Futi Lama)
 * @version (6)
 */
import java.util.Scanner;
public class CaseChanger
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to convert the case of given character");
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        char a, A;
        int diff='a'-'A';
        if(ch>='A' && ch<='Z'){
            char lc=(char)(ch+diff);
            System.out.printf("The changed case of given character %c is %c",ch,lc);
        }else if(ch>='a' && ch<='z'){
            char uc=(char)(ch-diff);
            System.out.printf("The changed case of given character %c is %c.",ch,uc);
        }else
            System.out.printf("%c is not alphabet.",ch);
    }
}