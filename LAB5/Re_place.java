/**
 * Write a Java Program to replace each element of the array with product of every other element in a given array of integers.
Example: Input : nums1 = { 1, 2, 3, 4, 5, 6, 7} nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output: Array with product of every other element: [5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element: [5040, 0, 0, 0, 0, 0, 0, 0]
 *
 * @author (Lakpa Futi Lama)
 * @version (36)
 */
public class Re_place
{
    public static void main(String[] args)
    {
        System.out.println("A program to replace each element of array with product of other element in array");
        int []n1={ 1, 2, 3, 4, 5, 6, 7};
        int []n2={0, 1, 2, 3, 4, 5, 6, 7};
        int []x=new int[n1.length];
        int []y=new int[n2.length];
        for(int i=0; i<n1.length; i++){
            int k=1;
            for(int j=0; j<n1.length; j++){
                if(i==j){
                    continue;
                }
                k=k*n1[j];
                x[i]=k;
            }
        }
        System.out.print("The product of n[1]: ");
        for(int i=0; i<n1.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n2.length; i++){
            int l=1;
            for(int j=0; j<n2.length; j++){
                if(i==j){
                    continue;
                }
                l=l*n2[j];
                y[i]=l;
            }
        }
        System.out.print("The product of n[2]: ");
        for(int i=0; i<n2.length; i++){
            System.out.print(y[i]+" ");
        }
    }
}