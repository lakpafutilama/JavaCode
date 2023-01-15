import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class QuizMania {
    static String[] option = {"1)Poll ", "2)Ask Som Sir", "3)Phone a Friend", "4) Exclusive 50/50 offer"};
    public static void main(String[] args) throws IOException {
        BufferedReader easy = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Easy.txt"));
        BufferedReader easy1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\EasyAnswer.txt"));
        BufferedReader med = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Medium.txt"));
        BufferedReader med1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\MediumAnswer.txt"));
        BufferedReader hard = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\Hard.txt"));
        BufferedReader hard1 = new BufferedReader(new FileReader("C:\\Users\\DELL\\Java\\HardAnswer.txt"));
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:\\Users\\DELL\\Java\\Answer.txtt",true);
        char[] x = new char[10];
        System.out.println("Welcome to the QuizMania");
        System.out.println("Enter your name");
        String Username = sc.nextLine();
        Username = Username.toUpperCase();
        System.out.println("Press e to continue");
        boolean flag = true;
        int right=0, wrong=0;
        while (flag) {
            char e = sc.next().charAt(0);
            if (e == 'e') {
                flag = false;
                System.out.println("EASY ROUND");
                System.out.println(" +10 for correct answer");
                String File1;
                String File2;
                String FF;
                char[] answer1 = {'c', 'd', 'a', 'a', 'c', 'b', 'a', 'c', 'd', 'c'};
                int i = 0;
                while ((File1 = easy.readLine()) != null) {
                    File2 = easy1.readLine();
                    System.out.println(File1);
                    System.out.println(File2);
                    char input = sc.next().charAt(0);
                    x[i] = input;
                    if (input == answer1[i]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                        right++;
                    } else {
                        System.out.println("Incorrect answer");
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
        System.out.println("Congratulations " + Username + ",YOU HAVE EARNED " + easyTotal + " POINTS IN ROUND 1");
        fw.write("\nParticipant name: "+Username);
        fw.write("\nRound 1");
        fw.write("\nCorrect answers = "+right);
        fw.write("\nIncorrect answers = "+wrong);
        fw.write("\nTotal score in round 1: "+ easyTotal);
        fw.write("\n");
        System.out.println();

        System.out.println("Let the round 2 begin");
        System.out.println("Press m to continue");
        right=0;
        wrong=0;
        while (flag) {
            char m = sc.next().charAt(0);
            if (m == 'm') {
                flag = false;
                System.out.println("WELCOME TO ROUND 2");
                System.out.println("10 marks for correct & 5 marks deducted for wrong answer,");
                System.out.println();
                String file3;
                String file4;
                char[] answer2 = {'a', 'b', 'c', 'b', 'a', 'd', 'a', 'a', 'b', 'b'};
                int j = 0;
                while ((file3 = med.readLine()) != null) {
                    file4 = med1.readLine();
                    System.out.println(file3);
                    System.out.println(file4);
                    char input2 = sc.next().charAt(0);
                    x[j] = input2;
                    if (input2 == answer2[j]) {
                        System.out.println("Correct answer, you earned 10 points ");
                        System.out.println();
                        right++;
                    } else {
                        System.out.println("Wrong! Your point is deducted by 10 points.");
                        System.out.println();
                        wrong++;
                    }
                    j++;
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
        System.out.println("Congratulations " + Username + ",YOU HAVE EARNED " + medTotal + " POINTS IN ROUND 2");
        fw.write("\nRound 2");
        fw.write("\nCorrect answers = "+right);
        fw.write("\nIncorrect answers = "+wrong);
        fw.write("\nTotal score in round 2: "+ medTotal);
        fw.write("\n");
        System.out.println();
        System.out.println("Let the round 3 begin");
        System.out.println("Press h to continue");
        right=0;
        wrong=0;
        while (flag) {
            char h = sc.next().charAt(0);
            if (h == 'h') {
                flag = false;
                System.out.println();
                System.out.println("Round 3");
                System.out.println("GO BIG OR GO HOME");
                System.out.println("20 points for correct answer, -20 for incorrect");
                String file5;
                String file6;
                char[] answer3 = {'b', 'c', 'b', 'b', 'c', 'd', 'a', 'b', 'b', 'd'};
                int p = 0;
                int count = 0;
                while ((file5 = hard.readLine()) != null) {
                    file6 = hard1.readLine();
                    System.out.println(file5);
                    System.out.println(file6);
                    if (count < 4)
                    {
                        System.out.println("Do you want to use lifeline?");
                        System.out.println("Press y for yes and n for no");
                        char lifeline = sc.next().charAt(0);
                        boolean temp = true;
                        while (temp) {
                            if (lifeline == 'y') {
                                count++;
                                Life(p);
                                temp = false;
                            } else if (lifeline == 'n') {
                                temp = false;
                                System.out.println("Enter your option");
                            } else
                            {
                                System.out.println("Enter either Y or N ");
                                lifeline = sc.next().charAt(0);
                            }
                        }
                    }
                    char input3 = sc.next().charAt(0);
                    x[p] = input3;
                    if (input3 == answer3[p])
                    {
                        System.out.println("Correct answer, you earned 20 points! ");
                        System.out.println();
                        right++;
                    }
                    else
                    {
                        System.out.println("Wrong! Your point is deducted by 20 points.");
                        System.out.println();
                        wrong++;
                    }
                    p++;
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
        System.out.println("Congratulations " + Username + ",YOU HAVE EARNED " + hardTotal + " POINTS IN ROUND 3");
        fw.write("\nRound 3");
        fw.write("\nCorrect answers = "+right);
        fw.write("\nIncorrect answers = "+wrong);
        fw.write("\nTotal score in round 3: "+ hardTotal);
        fw.write("\n");
        System.out.println();
        System.out.println("Total points from all round is: ");
        int sum = easyTotal + medTotal + hardTotal;
        fw.write("Your total points from all the round is : "+sum);
        fw.write("\n");
        System.out.println(sum);
        System.out.println("\nThank you for playing");
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
                point -= 20;
            }
        }
        return point;
    }

    public static void Life(int x) throws IOException{
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
        Scanner sc2 = new Scanner(System.in);

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
            int num1 = random.nextInt(100) ;
            int num2 = 100-num1;
            int num3 = num1-num2;
            int num4 = num2-num3;
            System.out.println("The audience chooses as ");
            System.out.println("Option a ="+num1);
            System.out.println("Option b ="+num2);
            System.out.println("Option c ="+num3);
            System.out.println("Option d ="+num4);
            System.out.println("CAUTION, audience may be wrong!!!");
            System.out.println("what is your answer?");
        }
        else if(n==2)
        {
            System.out.println("Calling som sir... tuurr tuurrr tuurrr");
            System.out.println("what is your answer?");
        }
        else if(n==3)
        {
            System.out.println("Enter your friend's phone no.");
            long number = sc2.nextLong();
            System.out.println("Dialing " + number +"......");
            System.out.println("what is your answer?");
        }
        else if(n==4)
        {
            System.out.println("You'll have two chances to choose your answer");
            System.out.println("Are you ready, press y");
            char sur = sc2.next().charAt(0);
            if (sur =='y'){
                c=x;
                System.out.println("Syc no two chance for you!, This is hard round");
                System.out.println(ans[c]);
            }
            System.out.println("what is your answer?");
        }

        for (int i = 0; i < option.length; i++) {
            if (n == (i + 1)) {
                option[i]=" Already used ";
            }
        }

    }
}
