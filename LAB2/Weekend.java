/**
Write a Java program that input a number from the user and checks if the number is between 1-7 or not.
If the number is not between 1-7, your program should make the number fall in the range, then displays the name of the weekday.
Sample Output:
input: 4 Output: Wednesday
input 10 Output: Tuesday
(Use if else to check the range and switch case to display the week day.)
 * @author (Lakpa Futi Lama)
 * @version (18)
 */
import java.util.Scanner;
public class Weekend
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int w=n%7;
        switch(w){
        case 0:
            System.out.println("Saturday");
            break;
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        default:
            System.out.println("Wrong input");
        }
    }
}