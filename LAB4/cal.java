public class cal
{
    public static void main(String[] args)
    {
        int x=6;
        changeX(x);//passed by value
        System.out.println(x);
    }
    
    public static void changeX(int x)
    {
        x=10;
    }
}