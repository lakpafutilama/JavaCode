/**
 * 4. Define a class Student as described below:
 Instance variables:
 name, age, marks in three subjects (m1, m2, m3), minimum and average.
 Methods:
 i.   A parameterized constructor to initialize the instance variables.
 ii.  To accept the details of a student.
 iii. To compute the average and minimum out of the three marks.
 iv.  To display the name, age, marks in the three subjects, minimum and average.
 v.   Write a main method to create an object of the class and call the above methods.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    
    public Student(String a, int b, int c, int d, int e)
    {
        name=a;
        age=b;
        m1=c;
        m2=d;
        m3=e;
    }
    
    public void setName(String a)
    {
        name=a;
    }
    
    public void setAge(int b)
    {
        age=b;
    }
    
    public void setMarks1(int c)
    {
        m1=c;
    }
    
    public void setMark2(int d)
    {
        m2=d;
    }
    
    public void setMark3(int e)
    {
        m3=e;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getMark1()
    {
        return m1;
    }
    
    public int getMark2()
    {
        return m2;
    }
    
    public int getMark3()
    {
        return m3;
    }
    
    public int getMinimum()
    {
        if(m1<m2 && m2<m3)
        {
            return m1;
        }
        else if(m3<m1 && m2<m3)
        {
            return m3;
        }
        else
        {
            return m2;   
        }
    }
    
    public int getAverage()
    {
        return (m1+m2+m3)/3;
    }
    
    public void getDetails()
    {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Mark 1: "+getMark1());
        System.out.println("Mark 2: "+getMark2());
        System.out.println("Mark 3: "+getMark3());
        System.out.println("Minimum: "+getMinimum());
        System.out.println("Average: "+getAverage());
    }
}