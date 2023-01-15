import java.util.Scanner;
public class SumNaturalNumber
{
    public static int findSum(int n)
    {
        if(n<=1){
            return 1;
        }
        return n+findSum(n-1);
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum =findSum(n);
        System.out.println("The sum upto "+n+" is "+sum);
    }
}
