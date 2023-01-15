public class cal2
{
    public static void main(String[] args)
    {
        int x=6;
        x=changeX(x);//passed by value
        System.out.println(x);
    }
    
    public static int changeX(int x)
    {
        x=10;
        return x;
    }
}