/**
 * Write a Java program that reads a positive integer and count the number of digits the number (less than ten billion) has.
 * 10,000,000,000
Test Data
Input an integer number less than ten billion: 125463
Expected Output : 6
 *
 * @author (Lakpa Futi Lama)
 * @version (14)
 */
import java.util.Scanner;
public class Int_Length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that reads a positive integer and count the number of digits the number has");
        System.out.println("Enter the number");
        long m=sc.nextLong();
        long i=1, k=0;
        while(i<=m){
            i=i*10;
            k++;
        }
        System.out.println(k);
    }
}