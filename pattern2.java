import  java.util.*;
public class pattern2
{
	public static void main(String args[])   
	{   

		int i, j, row=6;     
			for(i=row; i<0; i--)   
			{    
				for(j=row; j<=i; j--)   
				{	   
					System.out.print("* ");   
				}    
				System.out.println();   
			}   
	}   

}