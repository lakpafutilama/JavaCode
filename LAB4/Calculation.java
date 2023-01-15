import java.util.Random;
import java.util.Scanner;
public class Calculation
{
    public static void main(String[] args)
    {
        int x=0, y=0, z=0;
        menu(x,y,z);
    }

    public static void menu(int x, int y, int c)
    {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        while(c!=6)
        {
            System.out.println("Option 1: Add");
            System.out.println("Option 2: Subtract");
            System.out.println("Option 3: Multiple");
            System.out.println("Option 4: Divide");
            System.out.println("Option 5: Power");
            System.out.println("Option 6: Quit");
            x=rand.nextInt(100);
            y=rand.nextInt(100);
            System.out.println("Enter your option 1-6");
            c=sc.nextInt();
            if(c==1){
                add(x,y);
            }else if(c==2){
                subtract(x,y);
            }else if(c==3){
                multiple(x,y);
            }else if(c==4){
                divide(x,y);
            }else if(c==5){
                System.out.println(x+"^"+y+"="+(int)Math.pow(x,y));
            }else if(c==6){
                System.out.print("Bye Bye");
            }else{

            }
        }
    }

    public static void add(int a, int b)
    {
        int p=a+b;
        System.out.println(a+"+"+b+"="+p);
    }

    public static void subtract(int a, int b)
    {
        int q=a-b;
        System.out.println(a+"-"+b+"="+q);
    }

    public static void multiple(int a, int b)
    {
        int r=a*b;
        System.out.println(a+"*"+b+"="+r);
    }

    public static void divide(int a, int b)
    {
        int s=a/b;
        System.out.println(a+"/"+b+"="+s);
    }
    
}