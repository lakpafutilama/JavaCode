import java.util.Random;
import java.util.Scanner;

public class Menu2
{
    public static void main(String[] args)
    {
        System.out.println("Option 1: Add");
        System.out.println("Option 2: Subtract");
        System.out.println("Option 3: Multiple");
        System.out.println("Option 4: Divide");
        System.out.println("Option 5: Power");
        System.out.println("Option 6: Quit");
        int x=0, y=0, c=0;
        menu(x,y,c);
    }

    public static void menu(int x, int y, int c)
    {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        while(c!=6)
        {
            x=rand.nextInt(100);
            y=rand.nextInt(100);
            System.out.println("Enter your option 1-6");
            c=sc.nextInt();
            System.out.println(x);
            System.out.println(y);
            if(c==1){
                System.out.println(add(x,y));
            }else if(c==2){
                System.out.println(subtract(x,y));
            }else if(c==3){
                System.out.println(multiple(x,y));
            }else if(c==4){
                System.out.println(divide(x,y));
            }else if(c==5){
                System.out.println(power(x,y));
            }else if(c==6){
                quit();
            }else{
                System.out.println("Enter option between 1-6");
            }
        }
    }

    public static int add(int a, int b)
    {
        int p=a+b;
        return p;
    }

    public static int subtract(int a, int b)
    {
        int q=a-b;
        return q;
    }

    public static int multiple(int a, int b)
    {
        int r=a*b;
        return r;
    }

    public static int divide(int a, int b)
    {
        int s=a/b;
        return s;
    }

    public static int power(int a, int b)
    {
        int t=(int)Math.pow(a,b);
        return t;
    }

    public static void quit()
    {
        System.out.print("Bye Bye");
    }
}