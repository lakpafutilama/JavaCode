/**
 *Write a Java program to display the number rhombus structure.
 *Test Data Input the number: 7 Expected Output :
 *       1
 *      212
 *     32123
 *    4321234
 *   543212345
 *  65432123456
 * 7654321234567
 *  65432123456
 *   543212345
 *    4321234
 *     32123
 *      212
 *       1
 *
 * @author (Lakpa Futi Lama)
 * @version (13)
 */
import java.util.Scanner;
public class Rhombus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to display the number rhombus structure.");
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int k=i; k>0; k--){
                System.out.print(k);
            }
            for(int l=2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println();    
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=(n-i); k>0; k--){
                System.out.print(k);
            }
            for(int l=2; l<=(n-i); l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}