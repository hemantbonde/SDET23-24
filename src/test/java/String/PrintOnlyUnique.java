package String;


import java.util.LinkedHashSet;

public class PrintOnlyUnique 
{

	public static void main(String[] args) 
	{
		
	
	String s = "tyss";
	
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
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
		if(count==1)
		{
			//set.add(ch);
			System.out.print(ch);
		}
		
		
	}
	}

	}
	