public class SortName
{
    public static void main(String[] args)
    {
        String[] a={"Ram","Hari","Sita","Shyam"};
        sortName(a);
        System.out.println("Array After Bubble Sort");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void sortName(String []n)
    {
        String temp="";
        int m=n.length;
        for(int i=0; i<(m-1); i++){
            for(int j=1; j<m; j++){
                if(n[i].compareTo(n[j])>0)
                {
                    //swap elements
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
}