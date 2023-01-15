import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
public class Quiz1 
{
    static String[] option = {"1)Poll ", "2)Ask Som Sir", "3)Phone a Friend", "4) Exclusive 50/50 offer"};
    public static void main(String[] args) throws IOException {
        BufferedReader easy = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Easy.txt"));
        BufferedReader easy1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\EasyAnswer.txt"));
        BufferedReader med = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Medium.txt"));
        BufferedReader med1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\MediumAnswer.txt"));
        BufferedReader hard = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Hard.txt"));
        BufferedReader hard1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\HardAnswer.txt"));
        Scanner sc = new Scanner(System.in);
        Timer time=new Timer();
        FileWriter fw = new FileWriter("C:\\Users\\DELL\\Java\\ScoreBoard.txt",true);
        char[] x = new char[10];
        System.out.println("Welcome to the QuizMania");
        System.out.println("Enter your name");
        String Username = sc.nextLine();
        Username = Username.toUpperCase();
        System.out.println("Press e to continue");
        String file1;
        String file2;
        boolean flag = true;
        int right=0, wrong=0;
        int i = 0;
        while (flag) {
            char e = sc.next().charAt(0);
            if (e == 'e') {
                flag = false;
                System.out.println("EASY ROUND");
                System.out.println("10 points for correct answer");
                char[] answer1 = {'c', 'd', 'a', 'a', 'c', 'b', 'a', 'c', 'd', 'c'};
                while ((file1 = easy.readLine()) != null) {
                    file2 = easy1.readLine();
                    System.out.println(file1);
                    System.out.println(file2);
                    char input = sc.next().charAt(0);
                    x[i] = input;
                    if (input == answer1[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                        right++;
                    } else {
                        System.out.println("Incorrect answer");
                        System.out.println("The correct option is "+answer1[i]);
                        System.out.println();
                        wrong++;
                    }
                    i++;
                }
            } else {
                System.out.println("Enter key e to continue");
            }
        }
        flag = true;
        int easyTotal = easyPoint(x);
        System.out.println("Summary of Round 1");
        System.out.println("Correct answers: "+right);
        System.out.println("Incorrect answers: "+ wrong);
        System.out.println("Congratulations " + Username + ",you have earned " + easyTotal + " points in 1");
        fw.write("\n Participant name: "+Username);
        fw.write("\n Round 1");
        fw.write("\n Correct answers = "+right);
        fw.write("\n Incorrect answers = "+wrong);
        fw.write("\n Total score in round 1: "+ easyTotal);
        fw.write("\n");
        System.out.println();
        System.out.println("Let the round 2 begin");
        System.out.println("Press m to continue");
        right=0;
        wrong=0;
        //time.schedule(new CountDown2(), 1000, 1000);
        while (flag) {
            char m = sc.next().charAt(0);
            if (m == 'm') {
                i=0;
                flag = false;
                System.out.println("WELCOME TO ROUND 2");
                System.out.println("-5 for wrong answer,10 for correct ");
                System.out.println();
                char[] answer2 = {'a', 'b', 'c', 'b', 'a', 'd', 'a', 'a', 'b', 'b'};
                while ((file1 = med.readLine()) != null) {
                    file2 = med1.readLine();
                    System.out.println(file1);
                    System.out.println(file2);
                    char input2 = sc.next().charAt(0);
                    x[i] = input2;
                    if (input2 == answer2[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                        right++;
                    } else {
                        System.out.println("Wrong! Your point is deducted by 5 points.");
                        System.out.println("The correct option is "+answer2[i]);
                        System.out.println();
                        wrong++;
                    }
                    i++;
                }
            } else {
                System.out.println("enter the m key to continue");
            }
        }
        flag = true;
        int medTotal = medPoint(x);
        System.out.println("Summary of Round 2");
        System.out.println("Correct answers: "+right);
        System.out.println("Incorrect answers: "+ wrong);
        System.out.println("Congratulations " + Username + ",you have earned " + medTotal + " points in round 2");
        fw.write("\n Round 2");
        fw.write("\n Correct answers = "+right);
        fw.write("\n Incorrect answers = "+wrong);
        fw.write("\n Total score in round 2: "+ medTotal);
        fw.write("\n");
        System.out.println();
        System.out.println("Let the round 3 begin");
        System.out.println("Press h to continue");
        right=0;
        wrong=0;
        //time.schedule(new CountDown2(), 1000, 1000);
        while (flag) {
            char h = sc.next().charAt(0);
            if (h== 'h') {
                i=0;
                flag = false;
                System.out.println();
                System.out.println("Round 3");
                System.out.println("GO BIG OR GO HOME");
                System.out.println("20 points for correct answer, -10 for incorrect");
                System.out.println();
                char[] answer3 = {'b', 'c', 'b', 'b', 'c', 'd', 'a', 'b', 'b', 'd'};
                //int p = 0;
                int count = 0;
                while ((file1 = hard.readLine()) != null) {
                    file2 = hard1.readLine();
                    System.out.println(file1);
                    System.out.println(file2);
                    System.out.println();
                    if (count < 4)
                    {
                        System.out.println("Do you want to use lifeline?");
                        System.out.println("Press y for yes and n for no");
                        char lifeline = sc.next().charAt(0);
                        boolean temp = true;
                        while (temp) {
                            if (lifeline == 'y') {
                                count++;
                                lifeLine(i);
                                temp = false;
                            } else if (lifeline == 'n') {
                                temp = false;
                                System.out.println("Enter your option");
                            } else
                            {
                                System.out.println("Enter either Y or n ");
                                lifeline = sc.next().charAt(0);
                            }
                        }
                    }
                    char input3 = sc.next().charAt(0);
                    x[i] = input3;
                    if (input3 == answer3[i])
                    {
                        System.out.println("Correct answer, you earned 20 points! ");
                        System.out.println();
                        right++;
                    }
                    else
                    {
                        System.out.println("Wrong! Your point is deducted by 10 points.");
                        System.out.println("The correct option is "+answer3[i]);
                        System.out.println();
                        wrong++;
                    }
                    i++;
                }
            }
            else
            {
                System.out.println("enter the h key to continue");
            }
        }
        int hardTotal = hardPoint(x);
        System.out.println("Summary of Round 3");
        System.out.println("Correct answers: "+right);
        System.out.println("Incorrect answers: "+ wrong);
        System.out.println("Congratulations " + Username + ",you have earned " + hardTotal + " points in round 3");
        fw.write("\n Round 3");
        fw.write("\n Correct answers = "+right);
        fw.write("\n Incorrect answers = "+wrong);
        fw.write("\n Total score in round 3: "+ hardTotal);
        fw.write("\n");
        System.out.println();
        System.out.println("Total points from all round is: ");
        int sum = easyTotal + medTotal + hardTotal;
        fw.write("\n Your total points from all the round is : "+sum);
        fw.write("\n");
        System.out.println(sum);
        System.out.println("\n Thank you for playing");
        fw.write("\n");
        fw.close();
    }

    public static int easyPoint(char[] arr) {
        int point = 0;
        char[] answer = {'c', 'd', 'a', 'a', 'c', 'b', 'a', 'c', 'd', 'c'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == answer[i]) {
                point += 10;
            }
        }
        return point;
    }

    public static int medPoint(char[] arr) {
        int point = 0;
        char[] answer = {'a', 'b', 'c', 'b', 'a', 'd', 'a', 'a', 'b', 'b'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == answer[i]) {
                point += 10;
            } else if (arr[i] != answer[i]) {
                point -= 5;
            }
        }
        return point;
    }

    public static int hardPoint(char[] arr) {
        int point = 0;
        char[] answer = {'b', 'c', 'b', 'b', 'c', 'd', 'a', 'b', 'b', 'd'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == answer[i]) {
                point += 20;
            } else if (arr[i] != answer[i]) {
                point -= 10;
            }
        }
        return point;
    }

    public static void lifeLine(int x) throws IOException{
        BufferedReader ff = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Fifty.txt"));
        Random random = new Random();
        String []ans=new String[10];
        String FF="";
        int c=0;
        while ((FF = ff.readLine()) != null)
        {
            ans[c]=FF;
            c++;
        }
        Scanner sc2= new Scanner(System.in);
        Timer time=new Timer();
        System.out.println("Which lifeline would you like to use?");
        boolean flag = true;
        for (String s : option) {
            System.out.print(s + " ");
        }
        System.out.println();
        int n = sc2.nextInt();
        while (flag)
        {
            if (n > 0 && n <= 5) {
                flag = false;
            } else {
                System.out.println("Enter 1,2 or 3");
                n = sc2.nextInt();
            }
        }
        if (n == 1)
        {
            int n1 = random.nextInt(100);
            int n2 = random.nextInt(100-n1);
            int n3 = random.nextInt(100-n1-n2);
            int n4 = 100-n1-n2-n3;
            System.out.println("The audience chooses as ");
            System.out.println("Option a ="+n1);
            System.out.println("Option b ="+n2);
            System.out.println("Option c ="+n3);
            System.out.println("Option d ="+n4);
            System.out.println();
            System.out.println("CAUTION, audience may be wrong!!!");
            System.out.println("Choose One Option");
        }
        else if(n==2)
        {
            System.out.println("Hello SOM sir, the participant needs your help.....");
            System.out.println("Choose One Option");
        }
        else if(n==3)
        {
            System.out.println("Enter your friend's phone no.");
            long number = sc2.nextLong();
            System.out.println("Dialing " + number +"......");
            System.out.println("You have 20 seconds to ask your friend.");
            time.schedule(new CountDown(), 1000, 1000);
        }
        else if(n==4)
        {
            System.out.println("You'll have two chances to choose your answer");
            System.out.println("Are you ready, press y");
            char sur = sc2.next().charAt(0);
            if (sur =='y'){
                c=x;
                System.out.println(ans[c]);
            }
            System.out.println("Choose One Option");
        }

        for (int i = 0; i < option.length; i++) {

            if (n == (i + 1)) {
                option[i]="(Already Used)";
            }
        }

    }

}
