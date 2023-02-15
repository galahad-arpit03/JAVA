// write a program in  java  to make a simple calculator using switch case and 2 classes 
import  java.util.*;

class arithematicOperators
{	int result;
	
	public void Addition (int a,int b)
	{	result=a+b;
		System.out.println(result);
	}										
	public void Substraction (int a,int b)
	{	result=a-b;
		System.out.println(result);
	}
	public void Multiplication(int a,int b)
	{	result=a*b;
		System.out.println(result);
	}
	public void Division (int a,int b)
	{	result=a/b;
		System.out.println(result);
	}
}


class calcExample
{ 	
	
	public static void main(String arg[])
	{
		arithematicOperators A = new arithematicOperators();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter 1ST NUMBER ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd NUMBER ");
		int b = sc.nextInt();
		
		System.out.println("Enter Operator Number :  ");
		System.out.println("Enter 1 for addition ");
		System.out.println("Enter 2 for substraction ");
		System.out.println("Enter 3 for multiplication ");
		System.out.println("Enter 4 for Divide ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: A.Addition(a,b);
				break;
			case 2: A.Substraction(a,b);
				break;
			case 3: A.Multiplication(a,b);
				break;
			case 4: A.Division(a,b);
				break;
			default: System.out.println("Wrong Operator");
		}	

		
	}
}
