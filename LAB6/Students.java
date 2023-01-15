/**
 *  Write a class named Student. This class should contain some member variable (such as: name, age, rollno...). Define two method as mentioned below
    a. InitializeStudent(): This method will initialize object by taking all required variable as argument and assign it to the member 
    variables.
    b. printData(): this method will print all the data of student in formatted output format.
 *
 * @author (Lakpa Futi Lama)
 * @version (1)
 */
public class Students
{
    String name;
    int age;
    int rollno;
    
    public void InitializeStudent(String a, int b, int c)
    {
        name=a;
        age=b;
        rollno=c;
    }
    
    public void printData()
    {
        System.out.println("Name: "+getName());
        System.out.println("Name: "+getAge());
        System.out.println("Name: "+getRollno());
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getRollno()
    {
        return rollno;
    }
}