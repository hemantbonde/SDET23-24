package Array;

public class PrintLeastLengthString 
{
public static void main(String[] args) 
{
	

	
	String s[]= {"Hi","Hello","Bye","TYSS","Mango","ab"};
	
	
	String min=s[0];
	
	for(int i=1;i<s.length;i++)
	{
		if(s[i].length()<min.length())
		{
			min=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(min.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	}
}
}
