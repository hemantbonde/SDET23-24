package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PrintArrayValuesInDecendingOrder 
{

	
public static void main(String[] args) {
	

	String str[]= {"Hi","abc","abcd","abcdefgh","abcde","abcdef"};
	String rev[]= {};
	
	TreeSet<String> set = new TreeSet<String>();

	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
		//System.out.print(str[i]+" ");
	}
	for(int i=str.length;i>=0;i--)
	{
	rev[i]=rev[i]+str[i];
	
	}
	System.out.println(rev);
}
}	

