package String;

import java.util.LinkedHashSet;

public class RemoveDuplicate
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
	System.out.println(set);
	/*for(Character ch : set)
	{
		System.out.println(ch);
	}*/
}
}