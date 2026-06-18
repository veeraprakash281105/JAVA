import java.util.Scanner;

class Main {
    static int t = 100;
    static int x = 0;

    Main() {
        t--;
        x++;
        System.out.println("Car " + x + " Entered");
        System.out.println("Available slots: " + t);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Car Entering :");
        int n=sc.nextInt();
        Main[] m = new Main[n]; 
        for (int i = 0; i <n; i++) {
            m[i] = new Main(); 
        }
    }
}
