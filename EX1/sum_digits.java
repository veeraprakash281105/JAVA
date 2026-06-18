import java.util.Scanner;
class Main
{
    
    public static void main(String[] args)
    {
        int temp,s=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9)
        {
            s=0;
            while(n!=0)
            {
                temp=n%10;
                s=s+temp;
                n=n/10;
            }
            n=s;
        }
        System.out.println(s);
        sc.close(); 
    }
  
}
