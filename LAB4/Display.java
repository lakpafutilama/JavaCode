/**
 * Write a Java method (takes a number n as input) to displays an n-by-n matrix. (0’s and 1’s displayed are random)
  Expected Output:
  Input a number: 10
  1 0 0 1 1 0 0 0 1 1
  0 0 1 0 1 0 1 0 0 0
  0 1 0 1 0 0 0 0 0 1
  1 1 1 0 0 0 0 1 1 1
  1 1 0 1 1 1 0 1 0 0
  1 0 0 0 1 1 0 0 0 0
  0 0 1 0 0 0 0 1 1 1
  1 1 0 1 0 1 0 0 1 0
  0 0 1 0 0 0 0 1 1 0
  1 1 1 0 0 1 1 1 1 0
 *
 * @author (Lakpa Futi Lama)
 * @version (13)
 */
import java.util.Scanner;
import java.util.Random;

public class Display
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A method to display 0 and 1 matrix in n by n matrix");
        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
        display(n);
    }
    
    public static void display(int x)
    {
        Random rand=new Random();
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                int r=rand.nextInt(2);
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}