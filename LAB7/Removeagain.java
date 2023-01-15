import java.util.Scanner;
public class Removeagain
{
    public static void main(String[] args)
    {
        int count=0; 
        while(count<4)
        {
            Scanner sc=new Scanner(System.in);
            String[] option = {"1)Poll ", "2)Ask Som Sir", "3)Phone a Friend", "4) Exclusive 50/50 offer"};
            if(count==0)
            {
                for(int i=0; i<option.length; i++){
                    System.out.println(option[i]);
                }
            }

            int n=option.length-count;
            String []y=new String[n];
            System.out.print("Enter option ");
            for(int i=0; i<n; i++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
            int r=sc.nextInt();
            int j=0;
            for(int i=0; i<n-1; i++){
                if(r==(i+1)){
                    j++;
                }
                y[i]=option[j];
                j++;
            }

            for(int i=0; i<n-1; i++){
                option[i]=y[i];
            }
            for(int i=0; i<n-1; i++){
                System.out.println(y[i]);
            }
            count++;
        }
    }
}