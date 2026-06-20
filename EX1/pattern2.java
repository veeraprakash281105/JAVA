import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number (n): ");
        int n = sc.nextInt();
          int mid = n / 2;
        for (int r = 1; r <= mid; r++) {
            for (int s = 1; s <= mid - r + 1; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int c = 1; c <= n; c++) {
            System.out.print("*");
        }
        System.out.println();
        for (int r = 1; r <= mid; r++) {
            for (int s = 1; s <= mid; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= mid - r + 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
