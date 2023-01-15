/**
 * Write a Java Program to sort an array of positive integers of a given array, in the sorted array the value of the first element
should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.
 *
 * @author (Lakpa Futi Lama)
 * @version (31)
 */
import java.util.Scanner;
public class ArrayPattern
{
    public static void main(String[] args)// 1 2 3 4 5 6     6 1 5 2 4 3
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to sort array high and low");
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.println("The array is");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        int temp=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        int l=n/2;
        int []a=new int[l];
        int []b=new int[l+1];
        for(int i=0; i<l; i++){
            a[i]=x[i];
        }
        int k=0;
        for(int i=n-1; i>=l; i--){
            b[k]=x[i];
            k++;
        }
        int p=0, q=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                x[i]=b[p];
                p++;
            }else{
                x[i]=a[q];
                q++;
            }
        }
        System.out.println("The sorted array is");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
    }
}
