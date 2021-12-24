package String;

import java.util.Scanner;

public class SortTwoDigitNumberArray 
{

	public static void main(String[] args) 
	{
	
		int a[]= { 10 , 20 , 30 , 40 , 50 };
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the key");
		 
		int key=s.nextInt();
		for(int i=0;i<key;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
		
	}
	
	
}
