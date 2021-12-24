package Array;

public class AdditionOfDigits 
{

	public static void main(String[] args) 
	{
	
		int sum=0;
		int n=123;
		//int num=n;
		while(n!=0)
		{
			int dig=n%10;
			sum=sum+dig;
			n=n/10;
			
		}
		System.out.println(sum);
		
		
	}
	
}
