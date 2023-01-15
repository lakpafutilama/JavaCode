import java.util.Scanner;
public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Student st=new Student("Lakpa", 20, 80, 55, 90);
        // Student st=new Student();
        // st.setName(sc.nextLine());
        // st.setAge(sc.nextInt());
        // st.setMark1(sc.nextInt());
        // st.setMark2(sc.nextInt());
        // st.setMark3(sc.nextInt());
        st.getDetails();
    }
}