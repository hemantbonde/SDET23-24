package String;

import java.util.TreeSet;

public class PrintInAscendingArray 
{

	
	public static void main(String[] args) 
	{
	
		
		
		String str[]= {"abc","abcd","abcdefgh","abcde","abcdef"};
		
		
		TreeSet<String> set = new TreeSet<String>();

		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
			//System.out.print(str[i]+" ");
		}
		System.out.println(set);
		
		}
		
		
		
	}
	

