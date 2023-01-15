public class Zig {

    public static void main(String[] args) 
    {
        String m = "AMTADOESIHNSM";
        char []r=new char[m.length()];
        int k = (m.length() / 2)+1;
        int c=0;
        System.out.println(k);
        for (int i = 0; i < m.length(); i++) 
        {
            if (i % 2 == 0) {
                r[i] = m.charAt(c);
                c++;
            } else {
                r[i] = m.charAt(k);
                k++;
            }
            
        }
        for (int i = 0; i < r.length; i++) 
        {
            System.out.print(r[i]);
        }
    }

}
