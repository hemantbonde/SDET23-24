package String;

public class PrintCharInRightAngleOFSting 
{

	public static void main(String[] args) 
	{
	
		String s="Ashish";
		String rev="";
		int count=s.compareTo(rev);
		for(int i=0;i<count;i++)
		{
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		
	}
}
