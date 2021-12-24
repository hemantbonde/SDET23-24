package String;

import java.util.HashSet;

public class PrintOnlyDuplicateChar 
{

	public static void main(String[] args) 
	{
		
	
	String s = "tyss";
	
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
		if(count>1)
		{
			System.out.println(ch+" "+count);
		}
	}
}
}
	