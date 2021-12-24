package String;


import java.util.HashSet;
import java.util.List;

public class CountOfCharInString 
{

	public static void main(String[] args) 
	{
		
	
	String s = "My Name is Ashish";

	HashSet<Character> set = new HashSet<Character>();
	//adding elements in HashSet object
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	
	for(Character ch : set)
	{
		int count=0;
	
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))	
				{
					count++;
				}
				
		}
		
		//System.out.println(ch+""+count);
	}
	}
}
