package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords 
{
public static void main(String[] args) {
	


	String s = "Welcome to tyss to apple apple";
	
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	
	String str[]=s.split(" ");
	
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	System.out.println(set);
	

}
}

