/**
 * Write a Java method to print characters between two characters (i.e. A to P ).
Note: Prints 20 characters per line
Expected Output:
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z
 *
 * @author (Lakpa Futi Lama)
 * @version (10)
 */
import java.util.Scanner;
public class Printchar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Character starting from");
        char ch=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        print(ch, ch2);
    }

    public static void print(char chh, char chh2)
    {
        int k=1;
        for(char i=chh; i<=chh2; i++, k++){
            System.out.print(i+" ");
            if(k%20==0){
                System.out.println();
            }
        }
    }
}
