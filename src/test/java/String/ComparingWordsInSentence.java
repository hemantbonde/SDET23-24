package String;

import java.util.HashSet;

public class ComparingWordsInSentence 
{
	public static void main(String[] args) 
	{
		
	


	String s = "Welcome to tyss to";
	
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
		System.out.println(word+" "+count);
	
	
}
}
}
