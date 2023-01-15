/**
 * Write a program that counts the number of times a particular character, such as ‘b’ appears in a file. The character can be specified 
 at the command line.
 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Countagain
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr=new FileReader("C:\\Users\\DELL\\Documents\\Notepad\\file.txt");
        int n=fr.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter specified character");
        char ch=sc.next().charAt(0);
        int c=0;
        while(n!=-1)
        {
            if(n==ch){
                c++;
            }
            n=fr.read();
        }
        fr.close();
        System.out.printf("%c has appeared %d times.",ch,c);
    }
}
