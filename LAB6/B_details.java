import java.util.Scanner;
public class B_details
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Book b=new Book();
        System.out.println("Enter book code, its name, author and price respectively");
        Book b=new Book(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println("Book Code: "+b.getBcode());
        System.out.println("Book Name: "+b.getBname());
        System.out.println("Book Author: "+b.getBauthor());
        System.out.println("Book Price: "+b.getBprice());
    }
}
