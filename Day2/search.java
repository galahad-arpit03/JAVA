import java.util.*;
public class search 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int num = sc.nextInt();
		int[]  array = new int[num]; 
		System.out.println("Enter Elements");
		for(int i = 0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i = 0;i<num;i++)
		{
			System.out.println(array[i]);
		}
	}
}
		
		
		
	