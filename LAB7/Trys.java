import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Trys {
    public static void main(String[] args) throws IOException {
        BufferedReader easy = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Easy.txt"));
        BufferedReader easy1 = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\EasyAnswer.txt"));
        BufferedReader med = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Medium.txt"));
        BufferedReader med1 = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\MediumAnswer.txt"));
        BufferedReader hard = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Hard.txt"));
        BufferedReader hard1 = new BufferedReader(new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\HardAnswer.txt"));
        Scanner sc = new Scanner(System.in);
        //FileWriter fw = new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\point.txt");
        System.out.println("Welcome to the QuizMania");
        System.out.println("Enter your name");
        String Username = sc.nextLine();
        Username = Username.toUpperCase(Locale.ROOT);
        int count = 1;
        while(count<4)
        {
            if (count == 1)
            {
                System.out.println("Easy Round");
                char k;
                String n;
                String n1;
                char[] x = new char[10];
                char[] answer = {'c','d','a','a','c','b','a','c','d','c'};
                int i = 0;
                while ((n = easy.readLine()) != null) {
                    n1 = easy1.readLine();
                    System.out.println(n);
                    System.out.println(n1);
                    k = sc.next().charAt(0);
                    x[i] = k;
                    if(k==answer[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Incorrect answer");
                        System.out.println();
                    }
                    i++;
                }
                System.out.println("CONGRATULATIONS " +Username + ",YOU HAVE EARNED "+ easyPoint(x)+" POINTS IN ROUND 1");
                System.out.println();
                System.out.println("Let the round 2 begin");
                count++;
            }
            else if (count == 2) {
                System.out.println();
                System.out.println("Round 2");
                char k;
                String n;
                String n1;
                char[] x = new char[10];
                char[] answer = {'a','b','c','b','a','d','a','a','b','b'};
                int i = 0;
                while ((n = med.readLine()) != null) {
                    n1 = med1.readLine();
                    System.out.println(n);
                    System.out.println(n1);
                    k = sc.next().charAt(0);
                    x[i] = k;
                    if(k==answer[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Wrong! Your point is deducted by 10 points.");
                        System.out.println();
                    }
                    i++;
                }
                System.out.println("CONGRATULATIONS " +Username + ",YOU HAVE EARNED"+ medPoint(x)+" POINTS IN ROUND 2");
                System.out.println();
                System.out.println("Let the round 3 begin");
                count++;
            }
            else if (count == 3) {
                System.out.println();
                System.out.println("Round 3");
                char k;
                String n;
                String n1;
                char[] x = new char[10];
                char[] answer = {'a','b','c','b','a','d','a','a','b','b'};
                int i = 0;
                while ((n = hard.readLine()) != null) {
                    n1 = hard1.readLine();
                    System.out.println(n);
                    System.out.println(n1);
                    k = sc.next().charAt(0);
                    x[i] = k;
                    if(k==answer[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Wrong! Your point is deducted by 10 points.");
                        System.out.println();
                    }
                    i++;
                }
                System.out.println("CONGRATULATIONS " +Username + ",YOU HAVE EARNED"+ hardPoint(x)+" POINTS IN ROUND 3");
                System.out.println();
                count++;
            }
            else {
                System.out.println("Thank you for headache");
            }
            System.out.println("Your total points from all round is: ");
            //int sum = easyPoint(x)+medPoint(x)+hardPoint(x);
        }
    }
    public static int easyPoint(char[] arr)
    {
        int point=0;
        char[] answer = {'c','d','a','a','c','b','a','c','d','c'};
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==answer[i])
            {
                point+=10;
            }
        }
        return point;
    }
    public static int medPoint(char[]arr)
    {
        int point=0;
        char[] answer = {'a','b','c','b','a','d','a','a','b','b'};
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==answer[i])
            {
                point+=10;
            }
            else
            {
                point -= 10;
            }
        }
        return point;
    }
    public static int hardPoint(char[] arr)
    {
        int point=0;
        char[] answer = {'c','d','a','a','c','b','a','c','d','c'};
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==answer[i])
            {
                point+=10;
            }
        }
        return point;
    }
}