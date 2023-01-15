/**
 * Write a program that converts the number entered in English to nepali.
input: 122.332
output: १२२.३३२
 *
 * @author (Lakpa Futi Lama)
 * @version (30)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class EnglishToNepali
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that converts the number entered in English to nepali");
        float e=sc.nextFloat();
        int diff='1'-'१';
        String m=e+"";
        String n="";
        for(int i=0; i<m.length(); i++){
            char ch=m.charAt(i);
            if(ch>='0' && ch<='9'){
                n+=(char)(ch-diff);
            }else{
                n+=ch;
            }
        }
        System.out.print(n);
    }
}