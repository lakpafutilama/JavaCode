/**
 * Write a program HighLow.java that implements a simple guessing game High and Low. The program selects a random number between 
1 to 100.The player than tries to guess its value. After each, the program gives a hint “higher” or “lower”.
 * An execution might look like this:
Guess 1: 52
Hint: higher
Guess 2: 72
Hint: lower
Guess 3: 68
Correct after only 3 guesses – brilliant!!
The program is terminated after 10 guesses with a suitable comment. Use Scanner class to take input from the user.
 *
 * @author (Lakpa Futi Lama)
 * @version (26)
 */
import java.util.Scanner;
import java.util.Random;
public class Guess_Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that implements a simple guessing game High and Low");
        Random rand=new Random();
        int n=rand.nextInt(100);
        System.out.println("Guess the number between 1-100");
        for(int i=1; i<=10; i++){
            System.out.println("Guess:"+i);
            int x=sc.nextInt();
            if(x>n){
                System.out.println("Hint:Lower");
            }else if(x<n){
                System.out.println("Hint:Higher");
            }else{
                System.out.println("Congratulation!!!\nCorrect after "+i+" guesses");
                break;
            }
            System.out.println("Try again");
            if(i>=1 && i<10){
                System.out.println("You have "+(10-i)+" guess left");
            }
        }
    }
}