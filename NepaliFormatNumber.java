import java.text.DecimalFormat;
import java.util.Scanner;
public class NepaliFormatNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int num=sc.nextInt();
        System.out.println("Type e for english format and n for nepali format");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'e':
            case 'E':
                DecimalFormat edf = new DecimalFormat("###,###");
                System.out.println(edf.format(num));
                break;
            case 'n':
            case 'N':
                //int k = input % 1000;
                //int j = input * 1000;
                DecimalFormat df = new DecimalFormat("##,##,###");
                System.out.println(df.format(num));
            default:
                System.out.println("Enter valid input");
        }
    }
}