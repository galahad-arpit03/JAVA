// WAP in JAVA to print all even numbers present in an Array.

import  java.util.*;
public class array1
{
	public static void main(String args[])   
	{   
		Scanner sc = new Scanner(System.in);
		int a[]={1,2,5,6,3,2};  
			System.out.println("Odd Numbers:");  
			for(int i=0;i<a.length;i++)	
			{  
				if(a[i]%2!=0)
				{  
					System.out.println(a[i]);  
				}	  
			}  
			System.out.println("Even Numbers:");  
			for(int i=0;i<a.length;i++)
			{  
				if(a[i]%2==0)
				{  
					System.out.println(a[i]);  
				}  
			}  
	} 
	
}   

