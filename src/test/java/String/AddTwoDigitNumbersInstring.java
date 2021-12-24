package String;

public class AddTwoDigitNumbersInstring 

{

	public static void main(String[] args) 
	{
	
		String s="12ab23&nf45";
		int sum=0,gnum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int n=s.charAt(i)-48;
				gnum=gnum*10+n;
			}
			else
			{
				sum=sum+gnum;
				gnum=0;
			}
		}
		sum=sum+gnum;
		System.out.println(sum);
		
	}
	
	
	
}
