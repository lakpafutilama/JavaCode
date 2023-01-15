
/**
 * Write a Java method to find the smallest number among three numbers.
 Test Data:
 Input the first number: 25
 Input the Second number: 37
 Input the third number: 29
 Expected Output:
 The smallest value is 25.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Smallest2
{
    public static void main(String[] args)
    {
        int a=25, b=37, c=29;
        int s=findSmallest(a,b,c);
        System.out.printf("The smallest value is %d.",s);
    }
    
    public static int findSmallest(int a, int b, int c)
    {
        if(a<b && a<c){
            return a;
        }else if(b<a && b<c){
            return b;
        }else{
            return c;
        }
    }
}