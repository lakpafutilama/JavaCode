public class Math
{
    public static void main(String [] args)
    {
        int x = 99;
        int y = 30;
        int z = mod(x,y);
        display(z);
    }

    public static int mod(int x, int y)
    {
        return x%y;
    }

    public static void display(int z)
    {
        System.out.println("The modulos is "+z);
    }
}
