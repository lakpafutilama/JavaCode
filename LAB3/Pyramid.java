/**
 * Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
 *       1
 *      2 2
 *     3 3 3
 *    4 4 4 4
 *
 * @author (Lakpa Futi Lama)
 * @version (11)
 */
import java.util.Scanner;
public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to make pattern like a pyramid with repeating the number in the same row");
        System.out.println("Enter the number of row");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i+" "); 
            }
            System.out.println();
        }
    }
}