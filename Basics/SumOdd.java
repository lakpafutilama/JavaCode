import java.util.Scanner;
public class SumOdd
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int sum=0;
        int []x=new int [n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Input:"+(i+1));
            x[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        System.out.print("The odd elements in array are:");
        for(int i=0; i<n; i++)
        {
            if(x[i]%2!=0)
            {
                System.out.print(x[i]+" ");
                sum+=x[i];
            }
        }
        System.out.println();
        System.out.println("The sum of odd numbers of given array is "+sum);
    }
}