public class Array
{
    public static void main(String[]args)
    {
        char [] arr=new char[10];
        int asvalue='a';

        for(int i=0; i<10; i++)
        {
            arr[i]=(char)asvalue;
            asvalue++;
        }

        System.out.println("The array is ");
        for(int i=0; i<10; i++)
        {
            if(i<9)
            {
                System.out.print(arr[i]+", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        arr[7]='b';
        System.out.println();
        System.out.println("After assigning 'b' to the eighth element, the array is ");
        for(int i=0; i<10; i++)
        {
            if(i<9)
            {
                System.out.print(arr[i]+", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
    }
}