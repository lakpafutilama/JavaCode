/**
 * Write a program CountChars.java that counts different types of characters in a text that is read from a file. The program should 
count how many characters are found in the following categories:
·Upper case letters
·Lower case letters
·“Whitespace” (i.e. space, tab and return)
·Other characters
The search path to the text file you are reading can be coded directly into the program.
Write the final result in a text file called “counts.txt” as:
Upper Case: 30
Lower Case: 27
WhiteSpace:10
Others:14
 *
 * @author (Lakpa Futi Lama)
 * @version (1)
 */

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Count
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr=new FileReader("C:\\Users\\DELL\\Documents\\Notepad\\counts.txt");
        FileWriter fw=new FileWriter("C:\\Users\\DELL\\Documents\\Notepad\\text.txt");
        int n;
        int a=0, b=0, c=0, d=0;
        while((n=fr.read())!=-1){
            if(n>='a' && n<='z'){
                a++;
            }else if(n>='A' && n<='Z'){
                b++;
            }else if(n>='0' && n<='9'){
                
            }else if(n==' ' || n=='\r' || n=='\t'){
                c++;
            }else if(n=='\n'){
                
            }else{
                d++;
            }
            n=fr.read();
        }
        fr.close();
        fw.write("Lower case="+a+" ");
        fw.write("Upper case="+b+" ");
        fw.write("Whitespace="+c+" ");
        fw.write("Other character="+d+" ");
        fw.close();
    }
}