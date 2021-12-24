package String;



public class SwapFirstAndLastWord 
{
	
	public static void main(String[] args) 
	{

	String s = "Welcome to tyss to apple";	
	String temp="";
	String str[]=s.split(" ");
	int n=str.length;
	temp=str[0];
	str[0]=str[n-1];
	str[n-1]=temp;
	for(int i=0;i<=n-1;i++)
	{
	System.out.print(str[i]+ " ");
	}
	
	}
}
