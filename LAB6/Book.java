/**
 * Write a program to implement a Book class that stores the details of a book namely, bookcode, name of the book, name of the author(s)
    and price. The class has methods to display any of the details individually.
 *
 * @author (Lakpa Futi Lama)
 * @version (7)
 */
public class Book
{
    int code;
    String name;
    String author;
    int price;

    public Book()
    {
        code=101;
        name="Java";
        author="Srinivas";
        price=1000;
    }
    
    public Book(int a, String b, String c, int d)
    {
        code=a;
        name=b;
        author=c;
        price=d;
    }
    
    public int getBcode()
    {
        return code;
    }
    
    public String getBname()
    {
        return name;
    }
    
    public String getBauthor()
    {
        return author;
    }
    
    public int getBprice()
    {
        return price;
    }

}