
/**
 * Write a Java Program to sort a given binary array in linear times. From Wikipedia, Linear time:
 An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). Informally,
 this means that the running time increases at most linearly with the size of the input.
 More precisely, this means that there is a constant c such that the running time is at most cn for every input of
 size n. For example, a procedure that adds up all elements of a list requires time proportional to the length of the
 list, if the adding time is constant, or, at least, bounded by a constant. Linear time is the best possible time 
 complexity in situations where the algorithm has to sequentially read its entire input. Therefore, much research has 
 been invested into discovering algorithms exhibiting linear time or, at least, nearly linear time. This research
 includes both software and hardware Programs. There are several hardware technologies which exploit parallelism to
 provide this. An example is content-addressable memory. This concept of linear time is used in string matching
 algorithms such as the Boyer–Moore algorithm and Ukkonen's algorithm. 
 Example: Input : b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 } Output: After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 *
 * @author (Lakpa Futi Lama)
 * @version (33)
 */
import java.util.Scanner;
public class BinaryArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("A program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.");
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter elements 0 & 1");
        for(int i=0; i<n; i++){
            System.out.println("Element:"+(i+1));
            x[i]=sc.nextInt();
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
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
    }
}