import java.util.Scanner;
class Main
{
    static int t=100;
    static int x=0;
    
        Main()
        {
            t--;
            x++;
            System.out.println("Car "+x +" Entered");
            System.out.println("Available slots: "+t);
        }
        public static void main(String[] args)
        {
            Main m=new Main();
            Main m1=new Main();
            Main m2=new Main();
        }
}
