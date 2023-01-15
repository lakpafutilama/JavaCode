import java.util.Scanner;
public class HeightOfStudents
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int number = sc.nextInt();
        int[] arr = new int[number];
        double sum=0;
        System.out.println("Enter height of student in centimeter");
        for (int i = 0; i < number; i++) 
        {
            System.out.println("Height of student number " + (i + 1));
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The height of students in descending order is given below:");
        sortHeight(arr);
        System.out.println();
        System.out.println("The average height of the class is "+average(sum,number));
    }

    public static void sortHeight(int[] arr) 
    {
        int temp,k = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i]  < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static double average(double a,int number)
    {
        double average= a/number;
        return average;
    }
}
