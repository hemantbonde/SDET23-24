package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class PrintVAluesOfArrrayInAsscending 
{

	/*public static void main(String[] args) 
	{
	
		String mobiles[]= {"oppo","vivo","xiomi","redmi","oneplus","apple","samsung"};
		
		Arrays.sort(mobiles);
		System.out.println(Arrays.toString(mobiles));
		}
		
	}*/

	
	
	
	
	
	public static void main(String[] args) 
	{
		
	
	String s = "welcome to tyss gm";
	String str[]=s.split(" ");
	
	
	TreeSet<String> set = new TreeSet<String>();

	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
		//System.out.print(str[i]+" ");
	}
	System.out.println(set);
	
	}
	
	
	
	
	
	
}








