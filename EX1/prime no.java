public class Main
{
	public static void main(String[] args)
	{
		
		int num=2;
		while(num<100)
		{
			int divisors=0;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					divisors++;
				}
			}
			if(divisors==0)
			{
				System.out.println(num);
				
			}
			num++;
		}
	}
}
