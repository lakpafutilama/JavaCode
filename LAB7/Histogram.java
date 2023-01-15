/**
 * Create a program Histogram.java that reads any number of integers from a file and then write a simple histogram bar-chart in file
 *named “histo.txt” for all integers between 1 and 100. Note: not all integers in the file need to be in the interval [1-100].
An example of an execution:
Reading integers from the file: c:\assignment\myFile.dat
Number of integers in the interval [1, 100]: 55
Others: 20
Histogram
1 - 10 | ********
11 - 20 | *****
21 - 30 | **
31 - 40 | ****
41 - 50 | ********
51 - 60 | *****
61 - 70 | ***
71 - 80 | *********
81 - 90 | ******
91 - 100 | *****
 *
 * @author (Lakpa Futi Lama)
 * @version (2)
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Histogram
{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\DELL\\Documents\\Notepad\\histo.txt");
        Scanner sc=new Scanner(fr);
        String []s=new String[10];
        int y=0, z=0;
        for(int i=0; i<10; i++)
        {
            s[i]="";
        }
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            if((char)num>=0 && (char)num<=100){
                z++;
                int r=(num-1)/10;
                s[r]+="*";
            }
            else{
                y++;
            }
        }
        System.out.println("Number of integers in the interval [1, 100] : "+z);
        System.out.println("Others : "+y);
        for(int i=0; i<10; i++)
        {
            System.out.printf("%d1 - %d0 | ",i,(i+1));
            System.out.println(s[i]);
        }
        fr.close();
    }
}