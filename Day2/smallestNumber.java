// WAP in JAVA to print smallest number and greatest in an Array.

import  java.util.*;
public class smallestNumber
{
	public static void main(String args[])   
	{   
		Scanner sc = new Scanner(System.in);
		int a[]={1,2,5,6,3,2};  
			for(int i=0;i<a.length;i++)	
			{  
				if(a[i] >a[i+1])
				{  
					int temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;  
				}	  
			}  
			System.out.println("smallest number" +a[0]);  
			System.out.println("greatest number" +a[a.length]);  
			
	} 
	
}   

