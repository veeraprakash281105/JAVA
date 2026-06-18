import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                r=r+Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c))
            {
                r=r+Character.toUpperCase(c);
            }
            else{
                r=r+c;
            }
        }
        System.out.println(r);
        sc.close();
    }
}
