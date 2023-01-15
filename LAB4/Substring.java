/**
 * Write a method that accepts two strings as an argument, str1 and str2, and checks whether if str2 is substring of str1 or not.
 *
 * @author (Lakpa Futi Lama)
 * @version (21)
 */
import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to checks whether if str2 is substring of str1 or not");
        System.out.println("Enter 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        substring(str1, str2);
    }

    public static void substring(String s1,String s2)
    {
        int count=0;
        if(s1.length()>=s2.length())
        {
            for(int i=0; i<s1.length(); i++){
                char ch1=s1.charAt(i);//bigyan
                char ch2=s2.charAt(0);//gya
                if(ch1==ch2){
                    count++;
                    int k=i+1;
                    for(int l=1; l<s2.length(); l++){
                        char ch3=s1.charAt(k);
                        char ch4=s2.charAt(l);
                        if(ch3==ch4){
                            count++;
                        }
                        else{
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        if(count==s2.length()){
            System.out.println(s2+" is substring of "+s1);
        }else{
            System.out.println(s2+" is not substring of "+s1);
        }
    }
}