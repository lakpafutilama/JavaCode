import java.util.Scanner;
public class Calender
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the starting day:1 for sunday, 2 for monday and so on");
        int b=sc.nextInt();
        System.out.println("Enter the month");
        int m=sc.nextInt();
        System.out.println("Enter the year");
        int y=sc.nextInt();
        int k=1;
        switch(m){
            case 1:
                System.out.print("January");
                m=31;
                break;
            case 2:
                System.out.print("February");
                if(y%4==0 && y%100!=0 || y%400==0){
                    m=29;
                }else{
                    m=28;
                }
                break;
            case 3:
                System.out.print("March");
                m=31;
                break;
            case 4:
                System.out.print("April");
                m=30;
                break;
            case 5:
                System.out.print("May");
                m=31;
                break;
            case 6:
                System.out.print("June");
                m=30;
                break;
            case 7:
                System.out.print("July");
                m=31;
                break;
            case 8:
                System.out.print("August");
                m=31;
                break;
            case 9:
                System.out.print("September");
                m=30;
                break;
            case 10:
                System.out.print("October");
                m=31;
                break;
            case 11:
                System.out.print("November");
                m=30;
                break;
            case 12:
                System.out.print("December");
                m=31;
                break;
        }
        System.out.println(", "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=1; i==1; i++){
            for (int j=b-1; j>0; j--){
                System.out.print("    ");
            }
            for(int x=0; x<=(7-b); x++, k++){
                System.out.print("  "+k+" ");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for (int l=1; l<=7 && k<=m; l++, k++){
                if(k<=9)
                    System.out.print("  "+k+" ");
                else
                    System.out.print(" "+k+" ");
            }
            System.out.println();
        }
    }
}