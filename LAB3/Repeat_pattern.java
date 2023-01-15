/**
 * Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
The pattern is as follows :
1
22
333
4444
 *
 * @author (Lakpa Futi Lama)
 * @version (9)
 */
import java.util.Scanner;
public class Repeat_pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program in Java to display the pattern like right angle triangle which will repeat a number in a row.");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();//n
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);  
            }
            System.out.println();
        }
    }
}