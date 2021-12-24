package String;

import java.util.HashSet;

public class ReverseStringWithWords 
{

	
	public static void main(String[] args) 
	{
	String s = "Welcome to tyss'";
	String str[]=s.split(" ");
	String rev="";
	
	for(int i=str.length-1;i>=0;i--)
	{
		rev=rev+" "+str[i];
		
	}
	System.out.print(rev+" ");
	}
	}