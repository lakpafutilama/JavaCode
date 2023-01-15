import java.util.Scanner;
 
public class PrinterFlop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that print characters between two characters");
        System.out.println("Enter character you want to start from");
        char m = sc.next().charAt(0);
        System.out.println("Enter charatcter you want to end at");
        char n = sc.next().charAt(0);
        System.out.println(counter(m,n));
    }
 
    public static String counter(char a, char b)
    {
        String k="";
        int j=1;
        for(char i=a; i<=b; i++, j++)
        {
            k += i+" ";
            if(j%20==0)
            {
               k += "\n"; 
            }
        }
        return k;
    }
}