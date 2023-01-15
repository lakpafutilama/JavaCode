import java.io.FileReader;
import java.io.BufferedReader;

public class HistogramBuffer
{
    public static void main(String [] args) throws Exception
    {
        String [] histogram = new String[10];

        for(int i=0; i<10; i++)
        {
            histogram[i]="";
        }
        FileReader fr=new FileReader("C:\\Users\\DELL\\Documents\\Notepad\\histo.txt");
        BufferedReader reader = new BufferedReader(fr);
        String text = "";

        while((text = reader.readLine())!=null)
        {
            int num = Integer.parseInt(text);
            int inRange=(num-1)/10;
            histogram[inRange]=histogram[inRange]+"*";
        }
        for(int i=0; i<10; i++)
        {
            System.out.print("\n"+i+"1 - "+(i+1)+"0  "+histogram[i]);
        }
        reader.close();
    }
}