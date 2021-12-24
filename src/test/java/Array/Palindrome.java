package Array;

public class Palindrome 
{

	public static void main(String[] args)
	{
	
		int n=121;
		int num=n;
		int sum=0;
		int dig;
		while(n!=0)
		{
			dig=n%10;
			sum=sum*10+dig;
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Given Number is a palindrome");
		}
		else
		{
			System.out.println("Given Number is not a palindrome");
		}
	}
	
}
