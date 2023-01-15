/**
 * Write a program in java that takes a 4-digit PIN from the user. The user should have a total of 3 attempts of putting in the PIN.
If incorrect, the user should be warned with the remaining attempts.
P.S. Actual PIN is 5730
Output:
Please input the PIN: <take input>
Sorry, your PIN is incorrect. You have 2 attempts left.
 *
 * @author (Lakpa Futi Lama)
 * @version (25)
 */
import java.util.Scanner;
public class PIN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("A program that takes 4-digit PIN from the user and check it");
        System.out.println("Enter the pin");
        for(int i=1; i<=3; i++){
            System.out.println("Attempt:"+i);
            int p=sc.nextInt();
            int c=1, d=0;
            while(c<=p){
                d++;
                c=c*10;
            }
            if(d==4){
                int ap=5730;
                if(ap==p){
                    System.out.println("Congratulation, you have entered correct pin");
                    break;
                }else{
                    System.out.println("Sorry, your pin is incorrect now you have "+(3-i)+" attempts left");
                }
            }else{
                System.out.println("Sorry You have not entered 4-digit pin");
                break;
            }
        }
    }
}