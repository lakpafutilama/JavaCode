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

public class HistogramLong
{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\DELL\\Documents\\Notepad\\histo.txt");
        Scanner sc=new Scanner(fr);
        int y=0, a=0, b=0,c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0;
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            if((char)num>=1 && (char)num<=10){
                a++;
            }else if((char)num>=11 && (char)num<=20){
                b++;
            }else if((char)num>=21 && (char)num<=30){
                c++;
            }else if((char)num>=31 && (char)num<=40){
                d++;
            }else if((char)num>=41 && (char)num<=50){
                e++;
            }else if((char)num>=51 && (char)num<=60){
                f++;
            }else if((char)num>=61 && (char)num<=70){
                g++;
            }else if((char)num>=71 && (char)num<=80){
                h++;
            }else if((char)num>=81 && (char)num<=90){
                i++;
            }else if((char)num>=91 && (char)num<=100){
                j++;
            }else{
                y++;
            }
        }
        int z=a+b+c+d+e+f+g+h+i+j;
        System.out.println("Number of integers in the interval [1, 100] : "+z);
        System.out.println("Others : "+y);
        System.out.println("Histogram");
        int s;
        for(int p=1; p<=10; p++){
            System.out.printf("%d-%d | ",(p*10)-9, p*10);
            if(p==1){
                s=a;
            }else if(p==2){
                s=b;
            }else if(p==3){
                s=c;
            }else if(p==4){
                s=d;
            }else if(p==5){
                s=e;
            }else if(p==6){
                s=f;
            }else if(p==7){
                s=g;
            }else if(p==8){
                s=h;
            }else if(p==9){
                s=i;
            }else{
                s=j;
            }
            for(int r=0; r<s; r++){
                System.out.print("*");
            }
            System.out.println();
        }
        fr.close();
    }
}