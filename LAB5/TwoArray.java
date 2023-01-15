/**
 * Given two sorted arrays A and B of size p and q, write a Java Program to merge elements of A with B by maintaining the sorted order
i.e. fill A with first p smallest elements and fill B with remaining elements.
Example: Input: int[] A = { 1, 5, 6, 7, 8, 10 } int[] B = { 2, 4, 9 }
Output: Sorted Arrays: A: [1, 2, 4, 5, 6, 7] B: [8, 9, 10]
 *
 * @author (Lakpa Futi Lama)
 * @version (34)
 */
import java.util.Scanner;
public class TwoArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to merge elements of array A with B then fill A with p smallest elements & B with remaining");
        System.out.println("Enter size of first array");
        int p=sc.nextInt();
        int []a=new int[p];
        System.out.println("Enter element for first array");
        for(int i=0; i<p; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array");
        int q=sc.nextInt();
        int []b=new int[q];
        System.out.println("Enter element for second array");
        for(int i=0; i<q; i++){
            b[i]=sc.nextInt();
        }
        int r=p+q;
        int []c=new int[r];
        for(int i=0; i<r; i++){
            if(i<p){
                c[i]=a[i];
            }else{
                c[i]=b[i-p];
            }
        }
        int t=0;
        for(int i=0; i<r-1; i++){
            for(int j=i+1; j<r; j++){
                if(c[i]>c[j]){
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        for(int i=0; i<r; i++){
            if(i<p){
                a[i]=c[i];
            }else{
                b[i-p]=c[i];
            }
        }
        System.out.println();
        System.out.print("The Sorted array A is: ");
        for(int i=0; i<p; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("The sorted array B is: ");
        for(int i=0; i<q; i++){
            System.out.print(b[i]+" ");
        }
    }
}