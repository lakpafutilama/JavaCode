/**
 * Write a method that replaces all the vowels of a string passed as argument with the next character
 *
 * @author (your name)
 * @version (20)
 */
import java.util.Scanner;
public class Replace
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method that replaces all the vowels of a string passed as argument with the next character");
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(replace(s));
    }
    
    public static String replace(String x)
    {
        String a="";
        for(int i=0; i<x.length(); i++){
            char ch=x.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                
            }else{
                a+=ch+"";
            }
        }
        return a;
    }
}