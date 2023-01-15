/**
 * Write a Java Program to input a matrix A and create its transpose matrix AT and print the result.
 *
 * @author (Lakpa Futi Lama)
 * @version (17)
 */
import java.util.Scanner;
public class Transpose_Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to input a matrix A and create its transpose matrix A^T");
        System.out.println("Enter size of matrix A");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        System.out.println("Enter elements for matrix");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix A is:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of A is");
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}