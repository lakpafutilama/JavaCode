/**
 * Write the definition of different methods as utility function for array as
a. a method to add item into array at last
b. a method to add item into array at position specified by user
c. a method to remove an item from last of array
d. a method to remove an item for the position specified by user
e. a method to remove an item specified by user, return false if the item is not found.
f. a method to return the size of an array.
g. a method to display all the items in array.
h. a method to return the item from index specified by user.
i. a method to return the index of item specified by user, return -1 if the item is not found.
j. a method to check if array is empty.
k. a method to check if array is full.
l. a method to replace occurrence of old item by new item, both specified by user.
 *
 * @author (Lakpa Futi Lama)
 * @version (22)
 */
import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int []x=new int[n];
        System.out.println("Enter element for array");
        for(int i=0; i<n; i++){
            x[i]=sc.nextInt();
        }
        System.out.println("Choose option per your wish");
        System.out.println("a. a method to add item into array at last");
        System.out.println("b. a method to add item into array at position specified by user");
        System.out.println("c. a method to remove an item from last of array");
        System.out.println("d. a method to remove an item for the position specified by user");
        System.out.println("e. a method to remove an item specified by user, return false if the item is not found.");
        System.out.println("f. a method to return the size of an array");
        System.out.println("g. a method to display all the items in array");
        System.out.println("h. a method to return the item from index specified by user");
        System.out.println("i. a method to return the index of item specified by user, return -1 if the item is not found.");
        System.out.println("j. a method to check if array is empty.");
        System.out.println("k. a method to check if array is full.");
        System.out.println("l. a method to replace occurrence of old item by new item, both specified by user");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
                System.out.println("A method to add item into array at last");
                add(n,x);
                break;
            case 'b':
            case 'B':
                System.out.println("A method to add item into array at position specified by user");
                adds(n,x);
                break;
            case 'c':
            case 'C':
                System.out.println("A method to remove an item from last of array");
                remove(n,x);
                break;
            case 'd':
            case 'D':
                System.out.println("A method to remove an item for the position specified by user");
                removep(n,x);
                break;
            case 'e':
            case 'E':
                System.out.println("A method to remove an item specified by user, return false if the item is not found.");
                removes(n,x);
                break;
            case 'f':
            case 'F':
                System.out.println("A method to return the size of an array");
                size(n,x);
                break;
            case 'g':
            case 'G':
                System.out.println("A method to display all the items in array");
                displayArray(n,x);
                break;
            case 'h':
            case 'H':
                System.out.println("A method to return the item from index specified by user");
                returne(n,x);
                break;
            case 'i':
            case 'I':
                System.out.println("A method to return the index of item specified by user, return -1 if the item is not found");
                returni(n,x);
                break;
            case 'j':
            case 'J':
                System.out.println("A method to check if array is empty");
                check(n,x);
                break;
            case 'k':
            case 'K':
                System.out.println("A method to check if array is full");
                check(n,x);
                break;
            case 'l':
            case 'L':
                System.out.println("A method to replace occurrence of old item by new item, both specified by user");
                replace(n,x);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public static void add(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to want to add");
        int a=sc.nextInt();
        int []y=new int[n+1];
        for(int i=0; i<n; i++){
            y[i]=x[i];
        }
        y[n]=a;
        System.out.print("The new array is: ");
        for(int i=0; i<=n; i++){
            System.out.print(y[i]+" ");
        }
    }

    public static void adds(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to want to add");
        int a=sc.nextInt();
        System.out.println("Enter the index");
        int b=sc.nextInt();
        int []y=new int[n+1];
        for(int i=0; i<n; i++){
            y[i]=x[i];
            if(i==b){
                y[i]=a;
                for(int j=i+1; j<=n; j++){
                    y[j]=x[i];
                    i++;
                }
            }
        }
        System.out.print("The new array is: ");
        for(int i=0; i<=n; i++){
            System.out.print(y[i]+" ");
        }
    }

    public static void remove(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to want to remove");
        int a=sc.nextInt();
        int []y=new int[n-1];
        for(int i=0; i<n; i++){
            y[i]=x[i];
        }
        System.out.print("The new array is: ");
        for(int i=0; i<n-1; i++){
            System.out.print(y[i]+" ");
        }
    }

    public static void removep(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of element to want to remove");
        int a=sc.nextInt();
        int []y=new int[n-1];
        for(int i=0; i<n; i++){
            y[i]=x[i];
            if(i==a){
                for(int j=i+1; j<n; j++){
                    y[i]=x[j];
                    i++;
                }
            }
        }
        System.out.print("The new array is: ");
        for(int i=0; i<n-1; i++){
            System.out.print(y[i]+" ");
        }
    }

    public static void removes(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to want to remove");
        int a=sc.nextInt();
        int []y=new int[n-1];
        boolean check=false;
        for(int i=0; i<n; i++){
            y[i]=x[i];
            if(x[i]==a){
                check=true;
                for(int j=i+1; j<n; j++){
                    y[i]=x[j];
                    i++;
                }
            }else{
                check=false;
                break;
            }
        }
        if(check=true){
            System.out.print("The new array is: ");
            for(int i=0; i<n-1; i++){
                System.out.print(y[i]+" ");
            } 
        }
        else{
            System.out.println("false");
        }
    }

    public static int size(int n, int []x)
    {
        return n;
    }

    public static void displayArray(int n, int []x)
    {
        System.out.print("The array is: ");
        for(int i=0; i<=n; i++){
            System.out.print(x[i]+" ");
        }
    }

    public static int returne(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index");
        int a=sc.nextInt();
        return x[a];
    }

    public static int returni(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to want to search");
        int a=sc.nextInt();
        int b=-1;
        for(int i=0; i<n; i++){
            if(x[i]==a){
                b=i;
            }
        }
        return b;
    }

    public static void check(int n, int []x)
    {
        if(x==null){
            System.out.println("Array is empty");
        }else{
            System.out.println("Array is full");
        }
    }

    public static void replace(int n, int []x)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            if(x[i]%2!=0){
                System.out.println("Enter even element to replace odd element "+x[i]);
                int a=sc.nextInt();
                x[i]=a;
            }
        }
        System.out.println("The array after replacing is:");
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
    }
}
