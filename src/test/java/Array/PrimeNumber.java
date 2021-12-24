package Array;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
	
	int count=0,n=10;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(n+ " Is a Prime Number");
	}
	else
	{
		System.out.println(n+ " Is Not a Prime number");
	}
}
}
