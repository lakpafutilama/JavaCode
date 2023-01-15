/**
 * Write a java program to take a 2d array input from user and print the sum of each row, 
 column and total sum in as shown below:
 input:
 1 3 5
 2 4 6
 output:
 1 3 5 9
 2 4 6 12
 3 7 11 21
 *
 * @author (Lakpa Futi Lama)
 * @version (14)
 */
import java.util.Scanner;
public class array_2d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program to take a 2d array input from user and print the sum of each row,");
        System.out.println("Enter size of 2d array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]x=new int [m][n];
        System.out.println("Enter array element");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                x[i][j]=sc.nextInt();
            }
        }
        int sumr=0, sumc=0, sum=0;
        System.out.println("The sumed array is:");
        for(int i=0; i<m; i++){
            sumr=0;
            for(int j=0; j<n; j++){
                sumr+=x[i][j];
                System.out.print(x[i][j]+" ");
            }
            System.out.println(sumr);
        }
        for(int j=0; j<n; j++){
            sumc=0;
            for(int i=0; i<m; i++){
                sumc+=x[i][j];
            }
            sum+=sumc;
            System.out.print(sumc+" ");
        }
        System.out.print(sum);
    }
}