package String;

import java.util.HashSet;

public class PrintOnlyUniqueWords 
{

	
	public static void main(String[] args) 
	{
		
	


	String s = "Welcome to tyss to apple apple";
	
	HashSet<String> set = new HashSet<String>();
	
	String str[]=s.split(" ");
	
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	
	for(String word : set)
	{
		int count=0;
	
		for(int i=0;i<str.length;i++)
		{
			if(word.equals(str[i]))	
				{
					count++;
				}
				
		}
		if(count==1)
		{
		System.out.print(word+" ");
		}
}
	}
}

