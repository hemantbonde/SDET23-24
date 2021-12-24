package Array;

public class SumOfThreeMaxNumber 
{

	public static void main(String[] args) 
	{
	
		int a[]= {20,10,30,50,40};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		
		}
		int sum=0;
		for(int i=2;i<=4;i++)
		{
			sum=sum+a[i];
			
		}
				
		
		System.out.println("Sum of first 3 max numbers is "+sum);
	}
}
