package String;

public class AdditionOfTwoArrays 
{

	public static void main(String[] args) 
	{
	
		int a[]= {1,5,9};
		int b[]= {4,2,3,8};
		int count=a.length;
		if(count<b.length)
		{
		count=b.length;	
		}
		for(int i=0;i<count;i++)
		{
			try 
			{
			System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
			if(a.length>b.length)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(b[i]);
			}
			
		}
		
	}
}}