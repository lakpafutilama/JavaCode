/**
 * Write a Java Program to input two matrices order, check if the order is eligible to multiply,
if yes input the two matrices, multiply them and display the result.
 *
 * @author (Lakpa Futi Lama)
 * @version (16)
 */
import java.util.Scanner;
public class Mul_matrix
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter size of 1st matrix");
        a=sc.nextInt();
        b=sc.nextInt();
        int [][]x=new int[a][b];
        System.out.println("Enter size of 2nd matrix");
        c=sc.nextInt();
        d=sc.nextInt();
        int [][]y=new int[c][d];
        if(b==c)
        {
            System.out.println("Enter elements for matrix 1");
            for (int i=0; i<a; i++){
                for (int j=0; j<b; j++){
                    x[i][j]=sc.nextInt();
                }
            }
            System.out.println("The 1st matrix is:");
            for (int i=0; i<a; i++){
                for (int j=0; j<b; j++){
                    System.out.print(x[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter element for matrix 2");
            for (int i=0; i<c; i++){
                for (int j=0; j<d; j++){
                    y[i][j]=sc.nextInt();
                }
            }
            System.out.println("The 2nd matrix is:");
            for (int i=0; i<c; i++){
                for (int j=0; j<d; j++){
                    System.out.print(y[i][j]+" ");
                }
                System.out.println();
            }
            int [][]m=new int[a][d];
            for (int i=0; i<a; i++)
            {
                for (int j=0; j<d; j++)
                {
                    for(int k=0; k<b; k++)
                    {
                        m[i][j] += x[i][k]*y[k][j]; 
                    }
                }
            }
            System.out.println("The multiplication is:");
            for (int i=0; i<a; i++){
                for (int j=0; j<d; j++){
                    System.out.print(m[i][j]+" "); 
                }
                System.out.println();
            }
        }else
        {
            System.out.println("The multiplication is illegible");
        }
    }
}