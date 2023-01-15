/**
 * Write a Java method to count all vowels in a string.
 Test Data:
 Input the string: w3resource
 Expected Output: 
 Number of Vowels in the string: 
 *
 * @author (Lakpa Futi Lama)
 * @version (6)
 */
import java.util.Scanner;
public class length
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to count all vowels in a string.");
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int l=length(s);
        System.out.println(l);
    }
    
    public static int length(String ch)
    {
        int k=0;
        for(int i=0; i<ch.length(); i++){
            char che=ch.charAt(i);
            if(che=='a' || che=='e' || che=='i' || che=='o' || che=='u'){
                k++;
            }else if(che=='A' || che=='E' || che=='I' || che=='O' || che=='U'){
                k++;
            }else{
                
            }
        }
        return k;
    }
}