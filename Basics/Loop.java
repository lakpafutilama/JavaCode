public class Loop
{
    public static void main(String[] args)
    {
        int i=5; 
        while(i<8){ 
            for(int j=i;j>4; j--) 
                System.out.print((j+1) + " "); 
            i++; 
        }
    }
}
