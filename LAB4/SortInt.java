public class SortInt
{
    public static void main(String[] args)
    {
        int []a={2,3,1,5,4,7};
        sort(a);
        System.out.println("Array After Bubble Sort");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void sort(int []n)
    {
        int temp=0;
        int m=n.length;
        for(int i=0; i<m; i++){
            for(int j=1; j<m; j++){
                if(n[i]>n[j])
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