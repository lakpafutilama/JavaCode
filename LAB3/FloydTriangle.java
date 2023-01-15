/**
 * Write a program in Java to print the Floyd's Triangle.
Test Data
Input number of rows : 5
Expected Output :
1
01
101
0101
10101
 *
 * @author (Lakpa Futi Lama)
 * @version (12)
 */
import java.util.Scanner;
public class FloydTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to print the Floyd's Triangle");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int k=0;
        for (int i=1; i<=n; i++){
            if (i%2==0){
                    k=0;
                }else{
                    k=1;
                }
            for (int j=1; j<=i; j++){
                System.out.print(k);
                k=1-k;
            }
            System.out.println("");
        }
    }
}