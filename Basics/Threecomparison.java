import java.util.Scanner;
public class Threecomparison{
public static void main(String[]args)
    {
int a,b,c;
        Scanner sc=new Scanner(System.in);
System.out.println("Input a ");
        a= sc.nextInt();
System.out.println("Input b");
        b =sc.nextInt();
System.out.println("Input c");
        c = sc.nextInt();
boolean equal=(a==b)&&(b==c)&&(c==a);
boolean or= (a==b)||(b==c)||(a==c);
if (equal=true){
System.out.println("They are equal.");}
if (or=true){
System.out.println("Any two are equal.");}
    }
} 
