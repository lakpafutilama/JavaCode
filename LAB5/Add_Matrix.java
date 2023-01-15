/**
 * Write a Java Program to add two matrices of the same size.
 *
 * @author (Lakpa Futi Lama)
 * @version (15)
 */
import java.util.Scanner;
public class Add_Matrix
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A Program to add two matrices of the same size");
        System.out.println("Enter size of matrix");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][]x=new int[a][b];
        int [][]y=new int[a][b];
        int [][]z=new int[a][b];
        System.out.println("Enter elements for 1st matrix");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("The first matrix is:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter elements for 2nd matrix");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                y[i][j]=sc.nextInt();
            }
        }
        System.out.println("The second matrix is:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                z[i][j]=x[i][j]+y[i][j];
            }
        }
        System.out.println("The sum matrix is:");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}