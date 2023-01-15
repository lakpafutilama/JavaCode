import java.util.Scanner;

public class StoreSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = 0;
        double[] a = new double[4];
        System.out.println("Today sales report");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter today sales for store %d : ", (i + 1));
            a[i] = sc.nextInt();
            y = y + a[i];
        }
        double x;
        System.out.println("Sales bar chart");
        for (int i = 0; i < 4; i++) {
            x = a[i] / 500;
            System.out.print("store" + (i + 1) + ": ");
            for (int j = 1; j <= x; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        double[] p = new double[4];
        for (int i = 0; i < 4; i++) {
            p[i] = (a[i] / y) * 100;
        }
        System.out.println("Percentage of sales:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("store %d: %.2f", i + 1, p[i]);
            System.out.print("%");
            System.out.println();
        }
    }
}