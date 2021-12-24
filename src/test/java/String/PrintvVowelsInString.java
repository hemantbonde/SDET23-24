package String;

public class PrintvVowelsInString 
{

	
	public static void main(String[] args) 
	{
	
		String s="a1b$c2%72e9IoU";
		//int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				System.out.println(s.charAt(i));
			}
			
		}
		
		
	
	}
	
	
	
}
